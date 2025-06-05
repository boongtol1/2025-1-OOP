package DMU_TEST_TOJAVA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class B_2025_06_04_InputEx1 extends JFrame {
    JTextField tfId = new JTextField(15);
    JTextField tfName = new JTextField(15);
    JTextField tfDept = new JTextField(15);
    JTextArea textArea = new JTextArea(10, 30);
    JTextField tfSearch = new JTextField(15);
    JRadioButton rbId = new JRadioButton("학번");
    JRadioButton rbName = new JRadioButton("이름");
    JRadioButton rbDept = new JRadioButton("학과");
    Connection conn;

    public B_2025_06_04_InputEx1() {
        setTitle("학생 관리 프로젝트");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // 입력 부분
        gbc.insets = new Insets(5, 5, 5, 5); // padding
        gbc.gridx = 0; gbc.gridy = 0;
        add(new JLabel("학번:"), gbc);
        gbc.gridx = 1;
        add(tfId, gbc);

        gbc.gridx = 0; gbc.gridy = 1;
        add(new JLabel("이름:"), gbc);
        gbc.gridx = 1;
        add(tfName, gbc);

        gbc.gridx = 0; gbc.gridy = 2;
        add(new JLabel("학과:"), gbc);
        gbc.gridx = 1;
        add(tfDept, gbc);

        // 버튼들
        JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JButton btnInsert = new JButton("입력");
        JButton btnUpdate = new JButton("수정");
        JButton btnDelete = new JButton("삭제");
        JButton btnQuery  = new JButton("조회");

        btnPanel.add(btnInsert);
        btnPanel.add(btnUpdate);
        btnPanel.add(btnDelete);
        btnPanel.add(btnQuery);

        gbc.gridx = 0; gbc.gridy = 3; gbc.gridwidth = 2;
        add(btnPanel, gbc);

        // 검색
        gbc.gridx = 0; gbc.gridy = 4; gbc.gridwidth = 1;
        add(new JLabel("검색어:"), gbc);
        gbc.gridx = 1;
        add(tfSearch, gbc);

        JButton btnSearch = new JButton("검색");
        gbc.gridx = 1; gbc.gridy = 5;
        add(btnSearch, gbc);

        // 라디오 버튼
        JPanel radioPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        ButtonGroup group = new ButtonGroup();
        group.add(rbId); group.add(rbName); group.add(rbDept);
        radioPanel.add(rbId); radioPanel.add(rbName); radioPanel.add(rbDept);
        rbId.setSelected(true);

        gbc.gridx = 0; gbc.gridy = 6; gbc.gridwidth = 2;
        add(radioPanel, gbc);

        // 텍스트 출력 영역
        textArea.setEditable(false);
        JScrollPane scroll = new JScrollPane(textArea);
        gbc.gridx = 0; gbc.gridy = 7; gbc.gridwidth = 2;
        add(scroll, gbc);

        // DB 연결
        connectDatabase();

        // 이벤트 연결
        btnInsert.addActionListener(e -> insertStudent());
        btnUpdate.addActionListener(e -> updateStudent());
        btnDelete.addActionListener(e -> deleteStudent());
        btnQuery.addActionListener(e -> displayAllStudents());
        btnSearch.addActionListener(e -> searchStudent());

        pack();
        setLocationRelativeTo(null); // 화면 중앙
        setVisible(true);
    }

    private void connectDatabase() {
        try {
            conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb", "root", "lsh3500!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "DB 연결 실패: " + e.getMessage());
        }
    }

    private void insertStudent() {
        try {
            String sql = "INSERT INTO students VALUES (?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, tfId.getText());
            pstmt.setString(2, tfName.getText());
            pstmt.setString(3, tfDept.getText());
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "입력 완료");
            displayAllStudents();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "입력 실패: " + e.getMessage());
        }
    }

    private void updateStudent() {
        try {
            String sql = "UPDATE students SET name=?, dept=? WHERE id=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, tfName.getText());
            pstmt.setString(2, tfDept.getText());
            pstmt.setString(3, tfId.getText());
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "수정 완료");
            displayAllStudents();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "수정 실패: " + e.getMessage());
        }
    }

    private void deleteStudent() {
        try {
            String sql = "DELETE FROM students WHERE id=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, tfId.getText());
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(this, "삭제 완료");
            displayAllStudents();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "삭제 실패: " + e.getMessage());
        }
    }

    private void displayAllStudents() {
        try {
            String sql = "SELECT * FROM students";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            textArea.setText("");
            while (rs.next()) {
                textArea.append("| " + rs.getString("id") + " | " + rs.getString("name") + " | " + rs.getString("dept") + "\n");
            }
        } catch (Exception e) {
            textArea.setText("조회 실패: " + e.getMessage());
        }
    }

    private void searchStudent() {
        try {
            String field = "id";
            if (rbName.isSelected()) field = "name";
            else if (rbDept.isSelected()) field = "dept";

            String sql = "SELECT * FROM students WHERE " + field + " LIKE ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "%" + tfSearch.getText() + "%");
            ResultSet rs = pstmt.executeQuery();

            textArea.setText("");
            while (rs.next()) {
                textArea.append("| " + rs.getString("id") + " | " + rs.getString("name") + " | " + rs.getString("dept") + "\n");
            }
        } catch (Exception e) {
            textArea.setText("검색 실패: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        new B_2025_06_04_InputEx1();
    }
}
