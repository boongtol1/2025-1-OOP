package DMU_TEST_TOJAVA;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class B_2025_06_08_homework extends JFrame {
    private JTextField nameField, telField, comField;
    private JTextArea outputArea;
    private Connection conn;

    public B_2025_06_08_homework() {
        setTitle("homework");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400, 300);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(3, 2));
        inputPanel.add(new JLabel("이름"));
        nameField = new JTextField();
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("전화번호"));
        telField = new JTextField();
        inputPanel.add(telField);
        inputPanel.add(new JLabel("회사이름"));
        comField = new JTextField();
        inputPanel.add(comField);
        add(inputPanel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel(new GridLayout(3, 2, 5, 5));
        JButton insertBtn = new JButton("입력");
        JButton viewBtn = new JButton("조회");
        JButton searchBtn = new JButton("검색");
        JButton updateBtn = new JButton("수정");
        JButton deleteBtn = new JButton("삭제");
        JButton exitBtn = new JButton("종료");
        buttonPanel.add(insertBtn);
        buttonPanel.add(viewBtn);
        buttonPanel.add(searchBtn);
        buttonPanel.add(updateBtn);
        buttonPanel.add(deleteBtn);
        buttonPanel.add(exitBtn);
        add(buttonPanel, BorderLayout.CENTER);

        outputArea = new JTextArea(5, 30);
        add(new JScrollPane(outputArea), BorderLayout.SOUTH);

        connectDB();
        if (conn == null) {
            outputArea.setText("초기 데이터베이스 연결 실패!");
        }

        insertBtn.addActionListener(e -> insertRecord());
        viewBtn.addActionListener(e -> viewRecords());
        searchBtn.addActionListener(e -> searchRecord());
        updateBtn.addActionListener(e -> updateRecord());
        deleteBtn.addActionListener(e -> deleteRecord());
        exitBtn.addActionListener(e -> {
            closeConnection();
            System.exit(0);
        });

        setVisible(true);
    }

    void connectDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?useSSL=false", "root", "lsh3500!");
            outputArea.setText("데이터베이스 연결 성공!");
        } catch (ClassNotFoundException e) {
            outputArea.setText("JDBC 드라이버 로드 실패: " + e.getMessage());
            e.printStackTrace();
        } catch (SQLException e) {
            outputArea.setText("데이터베이스 연결 실패: " + e.getMessage());
            e.printStackTrace();
        }
    }

    void closeConnection() {
        if (conn != null) {
            try {
                conn.close();
                outputArea.setText("데이터베이스 연결 종료");
            } catch (SQLException e) {
                outputArea.setText("연결 종료 실패: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    void insertRecord() {
        if (conn == null) {
            outputArea.setText("데이터베이스 연결이 없습니다. 연결을 확인하세요.");
            connectDB();
            if (conn == null) return;
        }
        try (PreparedStatement ps = conn.prepareStatement("INSERT INTO addrtbl(name, tel, com) VALUES (?, ?, ?)")) {
            ps.setString(1, nameField.getText());
            ps.setString(2, telField.getText());
            ps.setString(3, comField.getText());
            ps.executeUpdate();
            outputArea.setText("입력 완료");
        } catch (SQLException e) {
            outputArea.setText("입력 실패: " + e.getMessage());
            e.printStackTrace();
        }
    }

    void viewRecords() {
        if (conn == null) {
            outputArea.setText("데이터베이스 연결이 없습니다. 연결을 확인하세요.");
            connectDB();
            if (conn == null) return;
        }
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery("SELECT * FROM addrtbl")) {
            outputArea.setText("");
            while (rs.next()) {
                outputArea.append(rs.getInt("id") + ", " + rs.getString("name") + ", " + rs.getString("tel") + ", " + rs.getString("com") + ", " + rs.getString("inDate") + "\n");
            }
        } catch (SQLException e) {
            outputArea.setText("조회 실패: " + e.getMessage());
            e.printStackTrace();
        }
    }

    void searchRecord() {
        if (conn == null) {
            outputArea.setText("데이터베이스 연결이 없습니다. 연결을 확인하세요.");
            connectDB();
            if (conn == null) return;
        }
        try (PreparedStatement ps = conn.prepareStatement("SELECT * FROM addrtbl WHERE name = ?")) {
            ps.setString(1, nameField.getText());
            ResultSet rs = ps.executeQuery();
            outputArea.setText("");
            while (rs.next()) {
                outputArea.append(rs.getInt("id") + ", " + rs.getString("name") + ", " + rs.getString("tel") + ", " + rs.getString("com") + ", " + rs.getString("inDate") + "\n");
            }
        } catch (SQLException e) {
            outputArea.setText("검색 실패: " + e.getMessage());
            e.printStackTrace();
        }
    }

    void updateRecord() {
        if (conn == null) {
            outputArea.setText("데이터베이스 연결이 없습니다. 연결을 확인하세요.");
            connectDB();
            if (conn == null) return;
        }
        try (PreparedStatement ps = conn.prepareStatement("UPDATE addrtbl SET com = ? WHERE name = ?")) {
            ps.setString(1, comField.getText());
            ps.setString(2, nameField.getText());
            int count = ps.executeUpdate();
            outputArea.setText(count + "개 수정 완료");
        } catch (SQLException e) {
            outputArea.setText("수정 실패: " + e.getMessage());
            e.printStackTrace();
        }
    }

    void deleteRecord() {
        if (conn == null) {
            outputArea.setText("데이터베이스 연결이 없습니다. 연결을 확인하세요.");
            connectDB();
            if (conn == null) return;
        }
        try (PreparedStatement ps = conn.prepareStatement("DELETE FROM addrtbl WHERE name = ?")) {
            ps.setString(1, nameField.getText());
            int count = ps.executeUpdate();
            outputArea.setText(count + "개 삭제 완료");
        } catch (SQLException e) {
            outputArea.setText("삭제 실패: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new B_2025_06_08_homework();
    }
}