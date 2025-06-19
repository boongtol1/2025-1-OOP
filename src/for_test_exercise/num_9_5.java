package for_test_exercise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class num_9_5 extends JFrame{

    private JLabel label[] = new JLabel[16];

    private Color[] colors = new Color[] {
    new Color(255, 99, 71),    // Tomato
    new Color(135, 206, 250),  // LightSkyBlue
    new Color(60, 179, 113),   // MediumSeaGreen
    new Color(218, 112, 214),  // Orchid
    new Color(255, 215, 0),    // Gold
    new Color(176, 224, 230),  // PowderBlue
    new Color(255, 182, 193),  // LightPink
    new Color(244, 164, 96),   // SandyBrown
    new Color(47, 79, 79),     // DarkSlateGray
    new Color(255, 105, 180),  // HotPink
    new Color(100, 149, 237),  // CornflowerBlue
    new Color(189, 183, 107),  // DarkKhaki
    new Color(0, 206, 209),    // DarkTurquoise
    new Color(123, 104, 238),  // MediumSlateBlue
    new Color(250, 128, 114),  // Salmon
    new Color(154, 205, 50)    // YellowGreen
};


    public num_9_5(){
        this.setTitle("4x4 Color 프레임");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(4,4));

        for (int i=0; i<label.length;i++){
            label[i] = new JLabel(String.valueOf(i));
            this.add(label[i]);
            label[i].setBackground(colors[i]);
            label[i].setOpaque(true); // 불투명하게 설정

        }

        



        this.setSize(700,300);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new num_9_5();
    }
    
}
