package DMU_TEST_TOJAVA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.util.ArrayList;

public class B_2025_04_16_no_3 extends JFrame {

    private JLabel nameLabel, studentIdLabel, majorLabel, subjectLabel;
    private JTextField nameField, studentIdField, majorField, subjectField;
    private JButton inputButton, cancelButton, saveButton, searchButton;

    private ArrayList<B_2025_04_16_Student> studentList = new ArrayList<>();

    public B_2025_04_16_no_3() {
        setTitle("GridLayout Sample");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2));

        nameLabel = new JLabel(" 이름");
        nameField = new JTextField();

        studentIdLabel = new JLabel(" 학번");
        studentIdField = new JTextField();

        majorLabel = new JLabel(" 학과");
        majorField = new JTextField();

        subjectLabel = new JLabel(" 과목");
        subjectField = new JTextField();

        inputButton = new JButton("입력");
        cancelButton = new JButton("취소");
        saveButton = new JButton("조회 및 파일저장");
        searchButton = new JButton("이름으로검색");

        this.add(nameLabel); this.add(nameField);
        this.add(studentIdLabel); this.add(studentIdField);
        this.add(majorLabel); this.add(majorField);
        this.add(subjectLabel); this.add(subjectField);
        this.add(inputButton); this.add(cancelButton);
        this.add(saveButton); this.add(searchButton);

        inputButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String strname = nameField.getText();
                String strstudentId = studentIdField.getText();
                String strmajor = majorField.getText();
                String strsubject = subjectField.getText();

                studentList.add(new B_2025_04_16_Student(strname, strstudentId, strmajor, strsubject));
                System.out.println("학생 정보가 추가되었습니다.");

                
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameField.setText("");
                studentIdField.setText("");
                majorField.setText("");
                subjectField.setText("");
            }
        });

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    FileWriter file = new FileWriter("/Users/boongtol/Desktop/student_info.txt");
                    // "student_info.txt"라는 파일을 쓰기(write) 용도로 엽니다.
                    // 해당 파일이 없으면 새로 생성합니다.
                    // 이미 파일이 존재하면 기존 내용을 지우고 덮어씁니다.
                    // Users/boongtol/Desktop/는 파일이 저장될 경로입니다

                    System.out.println("===== 저장된 학생 정보 =====");
                    for (B_2025_04_16_Student s : studentList) {
                        String line = "이름: " + s.getName() +
                                      ", 학번: " + s.getHb() +
                                      ", 학과: " + s.getDept() +
                                      ", 과목: " + s.getGwamok();
                        System.out.println(line);
                        file.write(line + "\n");
                    }
                    file.close();
                    System.out.println("파일 저장 완료!");
                    

                } catch (Exception ex) {
                    ex.printStackTrace();
                    System.out.println("파일 저장 완료!");

                }
            }
        });
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String searchName = JOptionPane.showInputDialog("검색할 이름을 입력하세요:");
        
                if (searchName == null || searchName.trim().isEmpty()) {
                    return; // 사용자가 취소하거나 빈 입력했을 경우
                }
        
                boolean found = false;
                for (B_2025_04_16_Student s : studentList) {
                    if (s.getName().equals(searchName.trim())) {
                        String info = "이름: " + s.getName() + "\n" +
                                      "학번: " + s.getHb() + "\n" +
                                      "학과: " + s.getDept() + "\n" +
                                      "과목: " + s.getGwamok();
                        JOptionPane.showMessageDialog(null, info, "검색 결과", JOptionPane.INFORMATION_MESSAGE);
                        found = true;
                        break;
                    }
                }
        
                if (!found) {
                    JOptionPane.showMessageDialog(null, "해당 학생을 찾을 수 없습니다.", "검색 실패", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
            


        this.setSize(400, 300);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new B_2025_04_16_no_3();
    }
}
