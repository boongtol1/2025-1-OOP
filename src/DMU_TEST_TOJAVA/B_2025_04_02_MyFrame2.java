package DMU_TEST_TOJAVA;

import javax.swing.JFrame;

public class B_2025_04_02_MyFrame2 extends JFrame{

    B_2025_04_02_MyFrame2() {
        this.setTitle("나의 첫GUI");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.setSize(300,200);
        this.setVisible(true);

    }
    public static void main(String[] args) {
        B_2025_04_02_MyFrame2 frame = new B_2025_04_02_MyFrame2();
    }
}

// 생성자는 상속되지 않는다!

// JFrame을 상속받는 이유?--> setTitle 와 같은 메서드 접근 가능하게끔 하려고!
// this 를 쓰는이유?--> 인스턴스 메서드를 생성자 안에서 접근해야 하기 때문!