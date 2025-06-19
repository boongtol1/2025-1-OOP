package for_test_exercise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class num_10_4_1 extends JFrame {

    private JPanel panel1 = new JPanel(new BorderLayout());
    private JPanel panel2 = new JPanel(new GridLayout(5, 5, 0, 0));
    private JLabel label1 = new JLabel("상하좌우 키로 블록을 이동시킬 수 있습니다");
    // 5×5 버튼 배열
    private JButton[][] grid = new JButton[5][5];
    // 블록의 현재 위치 (가운데에서 출발)
    private int row = 2, col = 2;

    public num_10_4_1() {
        super("상하좌우 키로 블록 이동");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // 상단 설명 패널
        panel1.setPreferredSize(new Dimension(400, 30));
        panel1.setBackground(Color.GRAY);
        panel1.add(label1);
        add(panel1, BorderLayout.NORTH);

        // 5×5 그리드 버튼 생성
        for (int r = 0; r < 5; r++) {
            for (int c = 0; c < 5; c++) {
                grid[r][c] = new JButton();
                grid[r][c].setEnabled(false);       // 클릭 비활성화
                grid[r][c].setBackground(null);     // 기본 배경
                panel2.add(grid[r][c]);
            }
        }
        // 초기 블록 표시
        grid[row][col].setBackground(Color.BLUE);

        add(panel2, BorderLayout.CENTER);

        // 전체 창에 키 리스너 등록
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                // 이전 위치 지우기
                grid[row][col].setBackground(null);

                switch (e.getKeyCode()) {
                    case KeyEvent.VK_LEFT:
                        if (col > 0) col--;
                        break;
                    case KeyEvent.VK_RIGHT:
                        if (col < 4) col++;
                        break;
                    case KeyEvent.VK_UP:
                        if (row > 0) row--;
                        break;
                    case KeyEvent.VK_DOWN:
                        if (row < 4) row++;
                        break;
                }

                // 새 위치에 블록 표시
                grid[row][col].setBackground(Color.BLUE);
            }
        });

        // 포커스 주기
        setFocusable(true);
        requestFocusInWindow();

        setSize(400, 420);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new num_10_4_1();
    }
}
