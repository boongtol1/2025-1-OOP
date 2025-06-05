package DMU_TEST_TOJAVA;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class B_2025_04_30_JComponentEx extends JFrame{

	B_2025_04_30_JComponentEx(){
		this.setTitle("JComponent의 공통 메소드 예제");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		JPanel pan1 = new JPanel(); //FlowLayout
		JButton btn1 = new JButton("글자색/배경색 설정 버튼");
		JButton btn2 = new JButton("비활성화(enable) 설정 버튼");
		JButton btn3 = new JButton("x, y좌표 알아내기 버튼");
		
		pan1.add(btn1);
		pan1.add(btn2);
		pan1.add(btn3);
		
		btn1.setBackground(Color.YELLOW);
		btn1.setForeground(Color.MAGENTA);
		
		btn2.setEnabled(false);
		
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println(btn3.getX() + ", " + btn3.getY());
			}
		});
		
		
		this.add(pan1);
		this.setSize(260,200);
		this.setVisible(true);
		
		
	}	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new B_2025_04_30_JComponentEx();
	}

}
