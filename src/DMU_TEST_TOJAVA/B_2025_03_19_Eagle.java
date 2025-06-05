package DMU_TEST_TOJAVA;

abstract class Animal {
    protected String name;

    // Animal 클래스에 생성자 추가
    public Animal(String name) {
        this.name = name;
    }

    abstract void move();
}

public class B_2025_03_19_Eagle extends Animal {
    private String home;

    B_2025_03_19_Eagle() {
        super("Unknown"); // 기본값 설정
        this.home = "Unknown";
    }

    B_2025_03_19_Eagle(String name, String home) {
        super(name);
        this.home = home;
    }

    @Override // 오타 수정: @override -> @Override
    void move() {
        System.out.println(name + "이(가) 하늘을 날아다닙니다.");
    }
}

class Tiger extends Animal {
    private int age;

    Tiger() {
        super("Unknown"); // 기본값 설정
        this.age = 0;
    }

    Tiger(String name, int age) { // 오타 수정: Sting -> String
        super(name);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    void move() {
        System.out.println(name + "이(가) 뛰어다닙니다.");
    }
}