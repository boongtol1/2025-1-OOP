package DMU_TEST_TOJAVA;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class B_2025_04_30_JRadioButtonEx extends JFrame{
	private JRadioButton[] radiobtn = new JRadioButton[3];
	private String [] text = {"사과", "배", "체리"};
	private ImageIcon [] image = {
			new ImageIcon("E:\\DMU\\객체지향프로그래밍\\week09\\src\\week09\\apple.png"),
			new ImageIcon("E:\\DMU\\객체지향프로그래밍\\week09\\src\\week09\\pear.png"),
			new ImageIcon("E:\\DMU\\객체지향프로그래밍\\week09\\src\\week09\\cherry.png")};
	
	private JLabel imageLabel = new JLabel();
	
	B_2025_04_30_JRadioButtonEx(){
		this.setTitle("JRadioButton ActionEvent 예제");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setLayout(new BorderLayout());
		JPanel radiopnl = new JPanel();
		ButtonGroup btngroup = new ButtonGroup();
		radiopnl.setBackground(Color.GRAY);
		for (int i = 0; i<3; i++) {
			radiobtn[i] = new JRadioButton(text[i]);
			btngroup.add(radiobtn[i]);
			radiopnl.add(radiobtn[i]);
			radiobtn[i].addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if(radiobtn[0].isSelected()) {
						imageLabel.setIcon(image[0]);
					} else if(radiobtn[1].isSelected()){
						imageLabel.setIcon(image[1]);
					} else {
						imageLabel.setIcon(image[2]);
					}
					
				}
			});
		}
		radiobtn[2].setSelected(true);
		imageLabel.setIcon(image[2]);
		this.add(radiopnl, BorderLayout.NORTH);
		this.add(imageLabel, BorderLayout.CENTER);
		this.setSize(250, 200);
		this.setVisible(true);
		
		


	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new B_2025_04_30_JRadioButtonEx();
	}

}
