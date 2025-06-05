package BOONGTOL_TOJAVA;

import javax.swing.JFrame;

public class b_9_1_MyFrame extends JFrame {
    public b_9_1_MyFrame() {
		setTitle("300x300 스윙 프레임 만들기");
		setSize(300,300); // 프레임 크기 300x300
		setVisible(true); // 프레임 출력
	}
	
	public static void main(String[] args) {
		b_9_1_MyFrame frame = new b_9_1_MyFrame();
	}
}
