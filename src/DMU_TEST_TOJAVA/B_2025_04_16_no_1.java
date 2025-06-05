package DMU_TEST_TOJAVA;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class B_2025_04_16_no_1 extends JFrame {

    public B_2025_04_16_no_1() {
        setTitle("판넬예제");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel questionLabel = new JLabel("아이스크림을 좋아하나요??");
        JButton yesButton = new JButton("Yes");
        JButton noButton = new JButton("No");

        // 버튼 클릭 이벤트 설정
        yesButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "예, 아이스크림을 좋아합니다.");
            }
        });

        noButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "아니요, 아이스크림을 좋아하지 않습니다.");
            }
        });

        add(questionLabel);
        add(yesButton);
        add(noButton);

        setSize(350, 120);
        setLocationRelativeTo(null); // 화면 중앙 배치
        setVisible(true);
    }

    public static void main(String[] args) {
        new B_2025_04_16_no_1();
    }
}
