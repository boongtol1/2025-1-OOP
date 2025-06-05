package DMU_TEST_TOJAVA;

import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class B_2025_04_30_JLabelEx extends JFrame{

	B_2025_04_30_JLabelEx(){
		this.setTitle("JComponent의 공통 메소드 예제 2");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JLabel txtLabel = new JLabel("사랑합니다. 여러분~~");
		ImageIcon img = new ImageIcon("E:\\DMU\\객체지향프로그래밍\\week09\\src\\week09\\heartIMG.png");
		JLabel imgLabel = new JLabel(img);
//		JButton btn = new JButton("따르릉~", new ImageIcon("E:\\DMU\\객체지향프로그래밍\\week09\\src\\week09\\Phone.png"));
		ImageIcon imgPhone = new ImageIcon("E:\\DMU\\객체지향프로그래밍\\week09\\src\\week09\\Phone.png");
		JButton btn = new JButton("따르릉~", imgPhone);
		
		
		this.setLayout(new FlowLayout());
		
		this.add(txtLabel);
		this.add(imgLabel);
		this.add(btn);
		
		this.setSize(400, 600);
		this.setVisible(true);
		
		
	}
	//GUI 생성 끝
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new B_2025_04_30_JLabelEx();
	}

}
