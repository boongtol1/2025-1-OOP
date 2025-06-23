package DMU_TEST_TOJAVA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class B_2025_05_07_SliderChangeEx extends JFrame {

    private JSlider[] sliders = new JSlider[3]; // R, G, B
    private JLabel colorLabel;
    private JButton btn;

    public B_2025_05_07_SliderChangeEx() {
        this.setTitle("슬라이더와 ChangeEvent 예제");
        this.setSize(400, 350);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new GridLayout(5, 1));

        Color[] sliderColors = {Color.RED, Color.GREEN, Color.BLUE};

        for (int i = 0; i < sliders.length; i++) {
            sliders[i] = new JSlider(0, 255, 128);
            sliders[i].setPaintLabels(true);        //눈금선 및 숫자 표시
            sliders[i].setPaintTicks(true);
            sliders[i].setMajorTickSpacing(50);
            sliders[i].setMinorTickSpacing(10);
            sliders[i].setForeground(sliderColors[i]);

            sliders[i].addMouseMotionListener(new MouseMotionAdapter() {
                public void mouseDragged(MouseEvent e) {
                    updateColor();
                }
            });

            this.add(sliders[i]);
        }

        // 색상 표시 라벨
        colorLabel = new JLabel("SLIDER EXAMPLE", SwingConstants.CENTER);
        colorLabel.setOpaque(true);
        this.add(colorLabel);

        // 확인 버튼
        btn = new JButton("확인");
        btn.setPreferredSize(new Dimension(80, 30));

        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Color c = colorLabel.getBackground();
                JOptionPane.showMessageDialog(null,
                        "현재 색상: R=" + c.getRed() + ", G=" + c.getGreen() + ", B=" + c.getBlue());
            }
        });

        // 버튼을 패널에 넣어서 크기 조정 및 정렬
        JPanel btnPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        btnPanel.add(btn);
        this.add(btnPanel);

        this.setVisible(true);
        updateColor();
    }

    private void updateColor() {
        int r = sliders[0].getValue();
        int g = sliders[1].getValue();
        int b = sliders[2].getValue();
        colorLabel.setBackground(new Color(r, g, b));
    }

    public static void main(String[] args) {
        new B_2025_05_07_SliderChangeEx();
    }
}
