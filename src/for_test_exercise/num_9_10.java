package for_test_exercise;

import javax.swing.*;
import java.awt.*;

public class num_9_10 extends JFrame {

    private JPanel p_west = new JPanel(new GridLayout(10, 1, 0, 1));
    private JPanel p_center = new JPanel(null);
    private JButton[] buttons = new JButton[10];
    private JLabel[] labellist = new JLabel[10];

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
        new Color(255, 105, 180)   // HotPink
    };

    public num_9_10() {
        this.setTitle("West Grid 프레임");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        // WEST 영역 - 색깔 버튼
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton();
            buttons[i].setBackground(colors[i]);                        // ✅ 배경색 설정
            buttons[i].setOpaque(true);                        // ✅ 불투명하게
            buttons[i].setContentAreaFilled(true);                    // ✅ 배경 채우기
            buttons[i].setBorderPainted(false);                       // ✅ 테두리 제거
                           
            p_west.add(buttons[i]);
        }

        p_west.setPreferredSize(new Dimension(50, 0));
        this.add(p_west, BorderLayout.WEST);

        for (int k=0; k<labellist.length; k++){

            int y = (int) (Math.random() * 372);
            int x = (int) (Math.random() * 350);            


            labellist[k] = new JLabel(String.valueOf(k));
            labellist[k].setForeground(Color.RED);
            labellist[k].setSize(labellist[k].getPreferredSize());
            labellist[k].setLocation(x, y);

        
            p_center.add(labellist[k]);
            
        }

        this.add(p_center);



        

        this.setSize(400, 400);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new num_9_10();
    }
}
