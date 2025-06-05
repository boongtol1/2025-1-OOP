package DMU_TEST_TOJAVA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class B_2025_05_07_SliderEx extends JFrame {
    public B_2025_05_07_SliderEx() {

        setTitle("슬라이더 만들기 예제");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        

        JSlider slider = new JSlider(JSlider.HORIZONTAL,0,200,100);
        slider.setPaintLabels(true);
        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(50);
        slider.setMinorTickSpacing(10);
        this.add(slider);    
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new B_2025_05_07_SliderEx();
    }
}
