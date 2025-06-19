package for_test_exercise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class num_9_3 extends JFrame{

    private JButton[] arraybutton = new JButton[10];



    public num_9_3(){
        this.setTitle("GridLayout으로 10개의 버튼을 배치한 프레임");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new GridLayout());

        for (int i =0;  i<arraybutton.length;  i++) {
            arraybutton[i] = new JButton(String.valueOf(i));
            this.add(arraybutton[i]);
        }

        this.setSize(750,300);
        this.setVisible(true);

    }

    

    public static void main(String[] args) {
        new num_9_3();
    }    
    
}

// 0부터 9까지 버튼을 총 10개를 만들때 '배열'을 활용하면 쉽게 할수 있다!!!

// int[] numbers = {1, 2, 3}; 는 컴파일러가 자동으로 int[] numbers = new int[]{1, 2, 3};로 해석해준다! // 초보때는 익숙해지기 전까지는 등호 오른쪽을 사용하는 습관을 기르자!

// JButton 생성자는 문자열(String) 또는 아이콘(ImageIcon) 같은 객체만 인자로 받게끔 설계되어있다!!

