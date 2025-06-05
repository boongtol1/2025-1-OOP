package BOONGTOL_TOJAVA;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*; // 👈 여기에 Container, Color, FlowLayout이 포함됨

public class b_9_2_ContentPaneEx extends JFrame {
    public b_9_2_ContentPaneEx() {
        setTitle("ContentPane과 JFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ✅ 역할: 창을 닫을 때 프로그램을 완전히 종료해주는 기능(상단의 x 표로 완전히 종류해주는 역할!)

        Container contentPane = getContentPane();
        contentPane.setBackground(Color.ORANGE);
        contentPane.setLayout(new FlowLayout());

        contentPane.add(new JButton("OK"));
        contentPane.add(new JButton("Cancel"));
        contentPane.add(new JButton("Ignore"));

        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new b_9_2_ContentPaneEx();
    }
}


// new b_9_2_ContentPaneEx(); 이렇게 변수 없이 객체를 생성했을 때… 👉 변수 이름은 없어요!

