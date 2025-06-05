package DMU_TEST_TOJAVA;

import javax.swing.*;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class B_2025_04_09_test extends JFrame {

    public B_2025_04_09_test() {
        this.setTitle("레이블 예제");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        GridLayout grid = new GridLayout(3, 1);
        this.setLayout(grid);

        JLabel label = new JLabel("기본텍스트");
        JButton btnHello = new JButton("안녕");
        JButton btnBye = new JButton("잘가");

        // 구성 요소 추가
        this.add(label);
        this.add(btnHello);
        this.add(btnBye);

        btnHello.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("안녕하세요? 반가워요~~");
            }
        });

        btnBye.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("안녕히 가세요~~");
            }
        });

        this.setSize(300, 200);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new B_2025_04_09_test();
    }
}
