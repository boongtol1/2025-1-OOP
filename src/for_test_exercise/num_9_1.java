package for_test_exercise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class num_9_1 extends JFrame {

    public num_9_1() {
        this.setTitle("Make a Window using Swing");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.getContentPane().setBackground(Color.YELLOW);


        this.setSize(400,150);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new num_9_1();
    }


    
}

// this.getContentPane().setBackground(Color.YELLOW); 이 부분에서 getContentPane()의 역할을 chat gpt 가지고 인식함!!