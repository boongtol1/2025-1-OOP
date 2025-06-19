package for_test_exercise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class num_10_4 extends JFrame{

    private JPanel panel1 = new JPanel(new BorderLayout());
    private JPanel panel2 = new JPanel(new GridLayout(5,5,0,0));
    private JLabel label1 = new JLabel("상하좌우 키로 블록을 이동시킬 수 있습니다");
    private JButton btn_init = new JButton();

    num_10_4(){
        this.setTitle("상하좌우 키로 블록 ...");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        panel1.setPreferredSize(new Dimension(500, 20));

        panel1.add(label1);
        panel1.setBackground(Color.GRAY);
        this.add(panel1,BorderLayout.NORTH);

        panel2.add(btn_init);
        btn_init.setOpaque(false); 
        btn_init.setContentAreaFilled(false);
        btn_init.setBorderPainted(false);
        btn_init.setForeground  (Color.blue);
        btn_init.setLocation(160,140);
        btn_init.setSize(80, 70);

        this.add(panel2);





        

        




        this.setSize(400,400);
        this.setVisible(true);
        
    }

    public static void main(String[] args) {
        new num_10_4();
    }
    
}
