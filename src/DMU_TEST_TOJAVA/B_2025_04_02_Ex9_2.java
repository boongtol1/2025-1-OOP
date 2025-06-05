package DMU_TEST_TOJAVA;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class B_2025_04_02_Ex9_2 extends JFrame{

    B_2025_04_02_Ex9_2() {

        this.setTitle("버튼 3개 추가 gui");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        JButton btn1 = new JButton("확인");
        this.add(btn1);
        this.add(new JButton("취소"));
        this.add(new JButton("삭제"));

        this.setSize(300,200);
        this.setVisible(true);
    }
    public static void main(String[] args) {

        new B_2025_04_02_Ex9_2();
        
    }
}
