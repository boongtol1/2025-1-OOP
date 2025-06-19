package for_test_exercise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class num_9_7 extends JFrame{

    private JPanel northpanel = new JPanel(new BorderLayout());
    private JPanel centerpanel = new JPanel(new GridLayout(4,5));
    private JPanel southpanel = new JPanel(new BorderLayout());


    private JLabel label1 = new JLabel("수식");
    private JTextField field1 = new JTextField();

    private JButton [] btn1 = new JButton[3];
    private JButton [] btn2 = new JButton[7];
    private JButton [] btn3 = new JButton[10];

    private JLabel label2 = new JLabel("계산 결과");
    private JTextField field2 = new JTextField();

    private String[] str1 = new String[]{"C" , "UN" , "BK"};
    private String[] str2 = new String[]{"/","*","-","+","%","=","."};
    private int[] int1 = new int[]{0,1,2,3,4,5,6,7,8,9};

    public num_9_7(){

        this.setTitle("자바 스윙 계산기");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        northpanel.add(label1,BorderLayout.WEST);
        northpanel.add(field1,BorderLayout.CENTER);
        northpanel.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 20));
        northpanel.setBackground(Color.GRAY);

        for (int i=0; i<btn1.length; i++){
            btn1[i] = new JButton(str1[i]);
            this.add(btn1[i]);
            

        }

        for (int k=0; k<btn2.length; k++){
            btn2[k] = new JButton(str2[k]);
            this.add(btn2[k]);
        }

        for (int p=0; p<btn3.length; p++){
            btn3[p] = new JButton(String.valueOf(int1[p]));
            this.add(btn3[p]);
        }

        
        centerpanel.add(btn1[0]);
        centerpanel.add(btn1[1]);
        centerpanel.add(btn1[2]);
        centerpanel.add(btn2[0]);
        centerpanel.add(btn3[7]);
        centerpanel.add(btn3[8]);
        centerpanel.add(btn3[9]);
        centerpanel.add(btn2[1]);
        

        centerpanel.add(btn3[4]);
        centerpanel.add(btn3[5]);
        centerpanel.add(btn3[6]);
        centerpanel.add(btn2[2]);

        centerpanel.add(btn3[1]);
        centerpanel.add(btn3[2]);
        centerpanel.add(btn3[3]);
        centerpanel.add(btn2[3]);

        centerpanel.add(btn3[0]);
        centerpanel.add(btn2[6]);
        centerpanel.add(btn2[5]);
        centerpanel.add(btn2[4]);

        this.add(centerpanel,BorderLayout.CENTER);


        this.add(northpanel,BorderLayout.NORTH);

        southpanel.add(label2,BorderLayout.WEST);
        southpanel.add(field2,BorderLayout.CENTER);
        southpanel.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 35));
        southpanel.setBackground(Color.YELLOW);

        this.add(southpanel,BorderLayout.SOUTH);

        


        



        

        



        this.setSize(400,400);
        this.setVisible(true);


    }

    public static void main(String[] args) {
        new num_9_7();
    }
    
}
