package DMU_TEST_TOJAVA;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class B_2025_04_09_test2 extends JFrame {

    // 필드 선언
    private JLabel lblUserId;
    private JLabel lblPassword;
    private JTextField txtUserId;
    private JPasswordField txtPassword;
    private JButton btnLogin;
    private JButton btnCancel;

    public B_2025_04_09_test2() {
        this.setTitle("Login Room");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        GridLayout grid = new GridLayout(3, 2);
        this.setLayout(grid);

        // 레이블 및 입력 필드
        lblUserId = new JLabel(" 사용자 ID");
        txtUserId = new JTextField();
        lblPassword = new JLabel(" 비밀번호");
        txtPassword = new JPasswordField();

        this.add(lblUserId);
        this.add(txtUserId);
        this.add(lblPassword);
        this.add(txtPassword);

        // 버튼 생성
        btnLogin = new JButton("로그인");
        btnCancel = new JButton("취소");

        // 로그인 버튼 리스너
        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String userId = txtUserId.getText();
                String password = new String(txtPassword.getPassword());

                System.out.println("로그인 시도: " + userId + ", 비밀번호: " + password);

                if (userId.equals("dongyang") && password.equals("1234")) {
                    System.out.println("로그인 성공");
                } else {
                    System.out.println("ID나 비밀번호 실패, 다시 입력하세요");
                }
            }
        });

        // 취소 버튼 리스너
        btnCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtUserId.setText("");
                txtPassword.setText("");
                System.out.println("입력값이 초기화되었습니다.");
            }
        });

        this.add(btnLogin);
        this.add(btnCancel);

        this.setSize(300, 200);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new B_2025_04_09_test2();
    }
}

// txtUserId.getText(); 는 입력한 id 를 읽어오라는 것! password 도 마찬가지


