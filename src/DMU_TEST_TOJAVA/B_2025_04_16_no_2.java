package DMU_TEST_TOJAVA;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class B_2025_04_16_no_2 extends JFrame {
    private JTextField emailField;
    private JPasswordField passwordField;
    private JButton loginButton, cancelButton;

    public B_2025_04_16_no_2() {
        setTitle("LOGIN FORM");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        // 컴포넌트 생성
        JLabel emailLabel = new JLabel("이메일");
        emailField = new JTextField(20);

        JLabel passwordLabel = new JLabel("비밀번호");
        passwordField = new JPasswordField(20);

        loginButton = new JButton("로그인");
        cancelButton = new JButton("취소");

        // 이벤트 핸들링
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String email = emailField.getText();
                String password = new String(passwordField.getPassword());

                if (email.equals("boongtol@icloud.com") && password.equals("1234")) {
                    JOptionPane.showMessageDialog(null,
                            "이메일 : " + email + "\n비밀번호 :" + password + "\n는 로그인되었습니다.");
                } else {
                    JOptionPane.showMessageDialog(null,
                            "이메일과 비밀번호를 다시 입력하십시오.");
                }
            }
        });

        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                emailField.setText("");
                passwordField.setText("");
            }
        });

        // 레이아웃 배치
        add(emailLabel);
        add(emailField);
        add(passwordLabel);
        add(passwordField);
        add(loginButton);
        add(cancelButton);

        setSize(400, 150);
        setLocationRelativeTo(null); // 화면 중앙
        setVisible(true);
    }

    public static void main(String[] args) {
        new B_2025_04_16_no_2();
    }
}
