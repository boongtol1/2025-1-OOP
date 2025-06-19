package for_test_exercise;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class num_9_9 extends JFrame{

    private JPanel panel1 = new JPanel(new BorderLayout());
    private JPanel panel2 = new JPanel(null);
    private JPanel panel3 = new JPanel(new BorderLayout());
    private JLabel label1 = new JLabel("별 개수");
    private JTextField field1 = new JTextField("");
    private JButton btn1 = new JButton("별 만들기");
    private JButton btn2 = new JButton("Refresh");
    private JButton btn3 = new JButton("Exit");
    private JLabel[] starlist = new JLabel[15];
    
    

    public num_9_9(){
        this.setTitle("랜덤한 별을 가진 프...");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        panel1.setPreferredSize(new Dimension(400, 30));
        panel1.add(label1,BorderLayout.WEST);
        panel1.add(field1,BorderLayout.CENTER);
        panel1.add(btn1,BorderLayout.EAST);
        panel1.setBackground(Color.gray);
        panel1.setBorder(BorderFactory.createEmptyBorder(0, 20, 0, 20));
        this.add(panel1,BorderLayout.NORTH);

        
        
        btn2.setBounds(5, 5, 90, 30); // 위치 지정
        panel2.add(btn2);   // 포커스 시 테두리 제거
                     // 버튼 먼저 추가 (괜찮음, 버튼이 투명해지기 때문)

        // 별은 나중에 추가
        for (int i = 0; i < starlist.length; i++) {
            int y = (int) (Math.random() * 312);
            int x = (int) (Math.random() * 400);
            starlist[i] = new JLabel("*");
            starlist[i].setForeground(Color.RED);
            starlist[i].setSize(starlist[i].getPreferredSize());
            starlist[i].setLocation(x, y);
            panel2.add(starlist[i]); // 별을 나중에 추가
            panel2.setComponentZOrder(starlist[i], 0); // ⭐ 반드시 이 줄 추가!
        }
        

        
        
        
       
        this.add(panel2,BorderLayout.CENTER);
        




        panel3.setPreferredSize(new Dimension(400, 30));
        panel3.add(btn3, BorderLayout.CENTER);
        panel3.setBackground(Color.yellow);
        panel3.setBorder(BorderFactory.createEmptyBorder(0, 150, 0, 150));
        
        this.add(panel3,BorderLayout.SOUTH);

        


        this.setSize(400,400);
        this.setVisible(true);

        int titleBarHeight = getInsets().top;
        System.out.println("타이틀바 높이: " + titleBarHeight);

       
        
    }

    public static void main(String[] args) {
        new num_9_9();

       
    }
    
}

// setLocation(x, y) 와 setSize(w, h) 를 합쳐논 메서드가 바로 setBounds!
// 컨테이너만 setlayout 이 가능하다!!
// borderlayout 에서는 각 요소들의 setsize 무용지물!
// 타이틀바는 일반적으로 너비와 높이를 직접 조정할 수 없습니다!
// borderlayout의 각 요소들의 높이와 너비를 설정하는법?--> setPreferredSize()를 사용하라!!
// JPanel의 디폴트 배치 관리자는 바로: FlowLayout
// JFrame 의 디폴트 배치 관리자는 BorderLayout
// new FlowLayout(FlowLayout.LEFT, 10, 10)에서 10, 10은 컴포넌트 간 여백을 설정합니다.
// 이걸 생략하면 디폴트값 5px이 적용됩니다.
// panel2.setComponentZOrder(starlist[i], 0); --> panel2에 있는 컴포넌트들 중에서 starlist[i] 라벨을 맨 앞으로(Z-index 가장 위) 올려서 다른 컴포넌트 위에 보이게 한다는 뜻입니다.

