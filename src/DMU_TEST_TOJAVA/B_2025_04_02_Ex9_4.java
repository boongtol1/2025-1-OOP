package DMU_TEST_TOJAVA;

import javax.swing.*;
import java.awt.*;

public class B_2025_04_02_Ex9_4 extends JFrame {

    public B_2025_04_02_Ex9_4() {
         this.setTitle("BorderLayout sample");
         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         this.setLayout(new BorderLayout(30,20));
         this.add(new JButton("Calculate"),BorderLayout.CENTER);
         this.add(new JButton("add"),BorderLayout.NORTH);
         this.add(new JButton("sub"),BorderLayout.SOUTH);
         this.add(new JButton("mul"),BorderLayout.EAST);
         this.add(new JButton("div"),BorderLayout.WEST);
         this.setSize(300,200);
         this.setVisible(true);
    }
    public static void main(String[] args) {
        new B_2025_04_02_Ex9_4();
    }
}
