package for_test_exercise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class num_10_3 extends JFrame {

    private JLabel label1 = new JLabel("Love Java");

    public num_10_3() {
        this.setTitle("Left 키로 문자열 이동");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        label1.setFont(new Font("Serif", Font.BOLD, 20));
        this.add(label1);

        // 💡 포커스 설정 (JLabel은 기본적으로 키 입력을 받지 않음)
        label1.setFocusable(true);
        label1.requestFocus();

        label1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    String text = label1.getText();
                    if (text.length() > 1) {
                        String front = text.substring(0, 1);
                        String rest = text.substring(1);
                        label1.setText(rest + front);
                    }
                }
            }
        });

        this.setSize(600, 250);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new num_10_3();
    }
}
