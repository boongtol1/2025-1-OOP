package DMU_TEST_TOJAVA;

import java.util.concurrent.Flow;

import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.FlowLayout;

public class B_2025_04_09_IndepClass extends JFrame{

    public B_2025_04_09_IndepClass() {
        setTitle("독립 클래스 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton btnOk = new JButton("EnglishAction");
        this.setLayout(new FlowLayout());
        this.add(btnOk);
        B_2025_04_09_MyAction mylistener = new B_2025_04_09_MyAction();
        btnOk.addActionListener(mylistener);



        setSize(350, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new B_2025_04_09_IndepClass();
    }
    
}
