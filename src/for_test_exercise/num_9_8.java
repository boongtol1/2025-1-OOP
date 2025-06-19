package for_test_exercise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class num_9_8 extends JFrame{

    private JPanel NP = new JPanel(new FlowLayout());
    private JPanel CP = new JPanel(new GridLayout(4,4,10,10));
    private JPanel SP = new JPanel(new FlowLayout());

    private JLabel label1 = new JLabel("숨겨진 이미지 찾기");

    private JButton button1 = new JButton("실행 시작");

    private JLabel[] labellist = new JLabel[16];



    public num_9_8(){

        this.setTitle("16장의 카드의 뒷면에 숨겨진 이미지 찾기");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        NP.setBackground(Color.YELLOW);
        NP.add(label1);
        this.add(NP,BorderLayout.NORTH);

        CP.setBorder(BorderFactory.createEmptyBorder(0, 50, 0, 50));
        CP.setBackground(Color.white);

        for (int i=0; i<labellist.length;i++){

            labellist[i] = new JLabel(String.valueOf(i));
            labellist[i].setBackground(Color.GREEN);
            


            labellist[i].setOpaque(true);
            
            
            CP.add(labellist[i]);
            this.add(CP,BorderLayout.CENTER); 
        
        }

        SP.setBackground(Color.YELLOW);
        SP.add(button1);
        this.add(SP,BorderLayout.SOUTH);
        

        this.setSize(300,300);
        this.setVisible(true);


    }
    public static void main(String[] args) {
        new num_9_8();
    }
    
}


// gridlayout 은 간격설정도 가능하다!!!!