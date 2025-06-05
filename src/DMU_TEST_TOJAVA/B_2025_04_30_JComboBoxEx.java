package DMU_TEST_TOJAVA;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class B_2025_04_30_JComboBoxEx extends JFrame{
	B_2025_04_30_JComboBoxEx(){
		setTitle("JComboBox ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setLayout(new FlowLayout());
		String[] fruits = {"apple", "banana", "kiwi", "mango", "pear", 
				"peach", "berry", "strawberry", "blackberry"};
		
		JComboBox<String> strCombo = new JComboBox<String>(fruits);
		this.add(strCombo);
		strCombo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println(strCombo.getSelectedIndex() + ", " + strCombo.getSelectedItem().toString());
			}
		});
		
		
		
		setSize(300, 300);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new B_2025_04_30_JComboBoxEx();
	}

}
