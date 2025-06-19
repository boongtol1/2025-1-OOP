package for_test_exercise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class num_10_1 extends JFrame{

    private JLabel label1 = new JLabel("Love Java");

    num_10_1(){
        this.setTitle("마우스 올...");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        label1.setFont(new Font("Serif", Font.BOLD, 20));
        this.add(label1);

        this.setSize(500,300);
        this.setVisible(true);

        label1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e ){
                label1.setText("사랑해 자바");
            }

            @Override
            public void mouseExited(MouseEvent e ){
                label1.setText("Love Java");
            }
        

        });
    
    }
    public static void main(String[] args) {
        new num_10_1();
    }
    
}
