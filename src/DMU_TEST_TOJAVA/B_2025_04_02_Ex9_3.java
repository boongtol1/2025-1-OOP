package DMU_TEST_TOJAVA;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class B_2025_04_02_Ex9_3 extends JFrame{

    public B_2025_04_02_Ex9_3() {
        this.setTitle("Flowlayout Sample");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout(FlowLayout.LEFT,30,40));
        this.add(new JButton("add"));
        this.add(new JButton("sub"));
        this.add(new JButton("mul"));
        this.add(new JButton("div"));
        this.add(new JButton("Calculate"));
        this.setSize(300,200);
        this.setVisible(true);

    }
    public static void main(String[] args) {

        new B_2025_04_02_Ex9_3();
        
    }
}
