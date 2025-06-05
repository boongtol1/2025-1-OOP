package DMU_TEST_TOJAVA;

public class B_2025_03_19_Exam10 {
    public static void main(String[] args) {
        // Tiger 객체 생성
        Tiger tig1 = new Tiger();
        Tiger tig2 = new Tiger("호돌이", 2);

        // Eagle 객체 생성 (클래스 이름 수정: Eagle -> B_2025_03_19_Eagle)
        B_2025_03_19_Eagle eag1 = new B_2025_03_19_Eagle("독수리", "절벽");

        // move() 메서드 호출
        tig2.move();
        eag1.move();

        // Animal 타입으로 객체 생성 (올바른 클래스 사용)
        Animal tig3 = new Tiger(); // Tiger 인스턴스 생성
        Animal eag2 = new B_2025_03_19_Eagle("신촌독수리", "신촌"); // B_2025_03_19_Eagle 인스턴스 생성

        // move() 메서드 호출
        tig3.move();
        eag2.move();
    }
}