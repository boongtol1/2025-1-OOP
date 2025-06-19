package for_test_exercise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class num_10_2 extends JFrame {

    private JPanel panel1 = new JPanel();

    num_10_2() {
        this.setTitle("드래깅동안 배경색 변경");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        panel1.setBackground(Color.GREEN);
        this.add(panel1);

        // ✅ 올바른 익명 클래스 사용법
        panel1.addMouseMotionListener(new MouseMotionAdapter() {
            @Override 
            public void mouseDragged(MouseEvent e) {
                panel1.setBackground(Color.YELLOW); // 패널 배경을 바꿔야 눈에 보임
            }
        });

        this.setSize(500, 300);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new num_10_2();
    }
}
