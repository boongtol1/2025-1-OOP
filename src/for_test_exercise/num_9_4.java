package for_test_exercise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class num_9_4 extends JFrame{

    private JButton[] arraybutton = new JButton[10];

    private Color[] color = new Color[]{ Color.RED , Color.ORANGE , Color.yellow , Color.GREEN , Color.CYAN , Color.BLUE, new Color(128, 0, 128), Color.GRAY , Color.PINK, Color.BLACK};



    public num_9_4(){
        this.setTitle("GridLayout으로 10개의 버튼을 배치한 프레임");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new GridLayout());

        for (int i =0;  i<arraybutton.length;  i++) {
            arraybutton[i] = new JButton(String.valueOf(i));
            arraybutton[i].setBackground(color[i]);
            arraybutton[i].setOpaque(true); // 불투명하게 설정
            arraybutton[i].setBorderPainted(false); // 테두리 제거 (선택)


            this.add(arraybutton[i]);

        }
        
        this.setSize(750,300);
        this.setVisible(true);

    }

    

    public static void main(String[] args) {
        new num_9_4();
    }    
    
}
