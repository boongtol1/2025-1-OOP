package for_test_exercise;

import javax.swing.*;
import java.awt.*;

public class BoundsTest extends JFrame {

    public BoundsTest() {
        setTitle("Bounds Test");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null); // 배치 관리자 제거

        // 1. (0, 0)에 빨간색 정사각형 배치
        JLabel labelTopLeft = new JLabel();
        labelTopLeft.setOpaque(true);
        labelTopLeft.setBackground(Color.RED);
        labelTopLeft.setBounds(0, 0, 50, 50); // content pane 기준 (0, 0)
        add(labelTopLeft);

        // 2. content pane의 실제 위치와 크기 출력
        System.out.println("ContentPane 위치: " + getContentPane().getLocation());
        System.out.println("ContentPane 크기: " + getContentPane().getSize());

        setSize(30, 78);
        setVisible(true);

        // 3. labelTopLeft의 실제 위치와 크기 확인
        SwingUtilities.invokeLater(() -> {
            System.out.println("labelTopLeft 위치: " + labelTopLeft.getLocation());

            int titleBarHeight = getInsets().top;
            System.out.println("타이틀바 높이: " + titleBarHeight);
        });
    }

    public static void main(String[] args) {
        new BoundsTest();
    }
}
