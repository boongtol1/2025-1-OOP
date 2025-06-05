package DMU_TEST_TOJAVA;

import java.awt.GridLayout;


import javax.swing.*;

public class B_2025_04_02_homework extends JFrame {

    public B_2025_04_02_homework() {

        this.setTitle("Login Room");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        GridLayout grid = new GridLayout(3,2);

        this.setLayout(grid);
        this.add(new JLabel(" 사용자 ID"));
        this.add(new JTextField(""));
        this.add(new JLabel(" 비밀번호"));
        this.add(new JTextField(""));
        this.add(new JButton("로그인"));
        this.add(new JButton("취소"));

        this.setSize(300,200);
        this.setVisible(true);
    }



    public static void main(String[] args) {
        new B_2025_04_02_homework();
    }
    
}
