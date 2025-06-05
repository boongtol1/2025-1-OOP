package DMU_TEST_TOJAVA;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

public class B_2025_04_09_EventEx1 extends JFrame {
    public B_2025_04_09_EventEx1() {
        setTitle("버튼 이벤트 예제 1");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // 버튼 객체 생성
        JButton okButton = new JButton("확인");
        JButton cancelButton = new JButton("취소");

        // 프레임에 버튼 추가
        this.add(okButton);
        this.add(cancelButton);

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                System.out.println(e);
                System.out.println("확인 버튼 클릭");
            }
        });
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                System.out.println(e);
                System.out.println("취소 버튼 클릭");
            }
        });

        setSize(300, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new B_2025_04_09_EventEx1();
    }
}
