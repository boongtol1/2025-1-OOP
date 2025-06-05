package DMU_TEST_TOJAVA;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class B_2025_04_30_JTextAreaEx extends JFrame{
	String text = "";
	B_2025_04_30_JTextAreaEx(){
		setTitle("JTextArea예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(new FlowLayout());
		
		this.add(new JLabel("입력 후 <Enter> 키를 입력하세요."));
		JTextField tf = new JTextField(20);
		JTextArea ta = new JTextArea(7, 20);
		this.add(tf);
		this.add(ta);
		
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ta.append((String)tf.getText() + "\n");
				tf.setText("");
			}
		});
		
		
		setSize(300, 300);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new B_2025_04_30_JTextAreaEx();
	}

}
