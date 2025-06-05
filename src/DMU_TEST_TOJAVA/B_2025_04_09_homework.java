package DMU_TEST_TOJAVA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class B_2025_04_09_homework extends JFrame {

    // 입력 필드 변수 선언
    private JTextField txtName;
    private JTextField txtStudentId;
    private JTextField txtMajor;
    private JTextField txtSubject;
    private JButton btnConfirm;
    private JButton btnCancel;

    public B_2025_04_09_homework() {

        this.setTitle("Login Room");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        GridLayout grid = new GridLayout(5, 2);
        this.setLayout(grid);

        // 이름
        this.add(new JLabel(" 이름"));
        txtName = new JTextField();
        this.add(txtName);

        // 학번
        this.add(new JLabel(" 학번"));
        txtStudentId = new JTextField();
        this.add(txtStudentId);

        // 학과
        this.add(new JLabel(" 학과"));
        txtMajor = new JTextField();
        this.add(txtMajor);

        // 과목
        this.add(new JLabel(" 과목"));
        txtSubject = new JTextField();
        this.add(txtSubject);

        // 버튼
        btnConfirm = new JButton("확인");
        btnCancel = new JButton("취소");
        this.add(btnConfirm);
        this.add(btnCancel);

        // 확인 버튼 이벤트
        btnConfirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = txtName.getText();
                String studentId = txtStudentId.getText();
                String major = txtMajor.getText();
                String subject = txtSubject.getText();

                
                System.out.println("이름: " + name);
                System.out.println("학번: " + studentId);
                System.out.println("학과: " + major);
                System.out.println("과목: " + subject);
            }
        });

        // 취소 버튼 이벤트
        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtName.setText("");
                txtStudentId.setText("");
                txtMajor.setText("");
                txtSubject.setText("");
                System.out.println("입력창이 초기화되었습니다.");
            }
        });

        this.setSize(300, 200);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new B_2025_04_09_homework();
    }
}
