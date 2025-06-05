package DMU_TEST_TOJAVA;

import javax.swing.*;


import java.awt.*;
import java.awt.event.*;

public class B_2025_05_14_LambdaEx3 extends JFrame {

    B_2025_05_14_LambdaEx3() {
        setTitle("람다식 적용 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLayout(new FlowLayout());
        JLabel lb = new JLabel("아이스크림을 좋아하나요?");
        JButton btnOk = new JButton("Yes");
        JButton btnNo = new JButton("No");
        btnOk.addActionListener(e -> System.out.println("네 좋아합니다."));
        btnNo.addActionListener(e -> System.out.println("아니요 싫어합니다."));
        // 람다식으로 이벤트 처리
             


        this.add(lb);
        this.add(btnOk);
        this.add(btnNo);



        
        this.setSize(400, 200);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new B_2025_05_14_LambdaEx3();


    }


    
}
