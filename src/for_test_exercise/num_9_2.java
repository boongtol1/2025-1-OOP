package for_test_exercise;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class num_9_2 extends JFrame{

    private JButton btn_N = new JButton("NORTH");
    private JButton btn_W = new JButton("WEST");
    private JButton btn_E = new JButton("EAST");
    private JButton btn_S = new JButton("SOUTH");
    private JButton btn_C = new JButton("CENTER");

    public num_9_2() {



        this.setTitle("BorderLayout 배치 관리자 연습");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(5,7));
        

        this.add(btn_N , BorderLayout.NORTH);
        this.add(btn_W , BorderLayout.WEST);
        this.add(btn_E,BorderLayout.EAST);
        this.add(btn_S,BorderLayout.SOUTH);
        this.add(btn_C,BorderLayout.CENTER);

        

        
        this.setSize(500,300);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new num_9_2();
    }


    
}


// 1. this.setLayout(new BorderLayout(5,7));이 add 메서드 위에 있어야 한다!!
// 2. JButton("NORTH");는 버튼 위에 표시할 텍스트이고 this.add(btn_N , BorderLayout.NORTH);는 버튼을 add 시에 해당 버튼을 어느 위치에 배치할것인지를 조정하는 부분이다!