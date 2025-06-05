package DMU_TEST_TOJAVA;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class B_2025_04_30_JCheckBoxEx extends JFrame{
	private String[] names = {"사과", "배","체리"};
	private int[] prices = {100, 500, 20000};
	private int sum;
	B_2025_04_30_JCheckBoxEx(){
		this.setTitle("체크박스와 ItemEvent가 아닌 ActionEvent 예제");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setLayout(new FlowLayout());
		
		JLabel sumLabel = new JLabel("현재 0원입니다.");
		
		this.add(new JLabel("사과 100원, 배 500원, 체리 20000원"));
		
		JCheckBox cbApple = new JCheckBox("사과");
		JCheckBox cbPear = new JCheckBox("배");
		JCheckBox cbCherry = new JCheckBox("체리");
		
		
		//사과
		cbApple.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(cbApple.isSelected()) {
					sum += prices[0];
				} else {
					sum -= prices[0];
				}
				sumLabel.setText("현재" + sum + "원입니다.");
			}
		});
		
		cbPear.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(cbPear.isSelected()) {
					sum += prices[1];
				} else {
					sum -= prices[1];
				}
				sumLabel.setText("현재" + sum + "원입니다.");
			}
		});
		
		cbCherry.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(cbCherry.isSelected()) {
					sum += prices[2];
				} else {
					sum -= prices[2];
				}
				sumLabel.setText("현재" + sum + "원입니다.");
			}
		});
		
		this.add(cbApple);
		this.add(cbPear);
		this.add(cbCherry);
		this.add(sumLabel);

		this.setSize(250, 200);
		this.setVisible(true);
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new B_2025_04_30_JCheckBoxEx();
	}

}
