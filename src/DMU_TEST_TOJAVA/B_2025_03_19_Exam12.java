package DMU_TEST_TOJAVA;

class ICat implements B_2025_03_19_IAnimal {
    @Override
    public void eat() {
        System.out.println("생선을 좋아한다");
    }
}

// ITiger 클래스 정의
class ITiger extends Animal implements B_2025_03_19_IAnimal {
    private int age;

    ITiger() {
        super("Unknown");
        this.age = 0;
    }

    ITiger(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    public void eat() {
        System.out.println(name + "이(가) 고기를 좋아한다");
    }

    @Override
    void move() {
        System.out.println(name + "이(가) 뛰어다닙니다");
    }
}

// 메인 클래스
public class B_2025_03_19_Exam12 {
    public static void main(String[] args) {
        // ICat 객체 생성 및 eat() 호출
        ICat cat1 = new ICat();
        cat1.eat();

        // ITiger 객체 생성 및 eat(), move() 호출
        ITiger tiger1 = new ITiger("호돌이", 2);
        tiger1.eat();
        tiger1.move();
    }
}