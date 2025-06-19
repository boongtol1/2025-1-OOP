package for_test_exercise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class num_9_6 extends JFrame{

    private JLabel blabel[] = new JLabel[20];

    



    public num_9_6(){
        this.setTitle("배치관리자 없는 컨...");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);

        for (int i=0; i<blabel.length;i++){

            int r = (int)(Math.random()*256);
            int g = (int)(Math.random()*256);
            int b = (int)(Math.random()*256);
            
            int x = (int)((Math.random()*241)+10);
            int y = (int)((Math.random()*241)+10);
            blabel[i] = new JLabel();
            blabel[i].setOpaque(true);
            blabel[i].setBackground(new Color(r,g,b)); 
            blabel[i].setBounds(x, y, 10, 10);

            this.add(blabel[i]);
            
        }





        this.setSize(300,300);
        this.setVisible(true);
             
    }

    public static void main(String[] args) {
        new num_9_6();
    }


    
}
