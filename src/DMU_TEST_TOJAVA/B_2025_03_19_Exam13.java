package DMU_TEST_TOJAVA;

// ClickLis 인터페이스 정의
interface ClickLis {
    void print();
}

// ClickClass 클래스 정의
class ClickClass implements ClickLis {
    @Override
    public void print() {
        System.out.println("클릭되었습니다.");
    }
}

// 메인 클래스
public class B_2025_03_19_Exam13 {
    public static void main(String[] args) {
        // ClickClass 객체 생성
        ClickClass obj1 = new ClickClass();
        // print() 메서드 호출
        obj1.print();
        
       int a = Integer.parseInt("100");
       double b = Double.parseDouble("100.123");
       
       String str = "안녕하세요";
       if (str.equals((String)"안녕하세요")) {
      
    }
}
}