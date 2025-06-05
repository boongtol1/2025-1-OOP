package DMU_TEST_TOJAVA;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class B_2025_04_02_Ex9_5 extends JFrame {

    public B_2025_04_02_Ex9_5() {

        this.setTitle("GridLayout Sample");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        GridLayout grid = new GridLayout(4,2);

        grid.setVgap(5);

        this.setLayout(grid);
        this.add(new JLabel(" 이름"));
        this.add(new JTextField(""));
        this.add(new JLabel(" 학번"));
        this.add(new JTextField(""));
        this.add(new JLabel(" 학과"));
        this.add(new JTextField(""));
        this.add(new JLabel(" 과목"));
        this.add(new JTextField(""));
        this.setSize(300,200);
        this.setVisible(true);






    }
    public static void main(String[] args) {
        new B_2025_04_02_Ex9_5();
    }
}
