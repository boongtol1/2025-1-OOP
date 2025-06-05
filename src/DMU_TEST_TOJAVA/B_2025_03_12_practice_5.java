package DMU_TEST_TOJAVA;

public class B_2025_03_12_practice_5 {

    public static void main(String[] args) {
        // 객체 생성
        B_2025_03_12_practice_4 myCar1 = new B_2025_03_12_practice_4();
        System.out.println(myCar1.getColor() + ", " + myCar1.getSpeed());
        
        B_2025_03_12_practice_4 myCar2 = new B_2025_03_12_practice_4("흰색", 0);
        B_2025_03_12_practice_4 myCar3 = new B_2025_03_12_practice_4("빨간색", 0);
        B_2025_03_12_practice_4 iuCar = new B_2025_03_12_practice_4("초록", 0);
        B_2025_03_12_practice_4 bkCar = new B_2025_03_12_practice_4("파랑", 0);
        
        // 정적 필드 및 정적 메서드 호출
        System.out.println("생산된 차의 대수(정적 필드) ==> " + B_2025_03_12_practice_4.carCount);
        System.out.println("생산된 차의 대수(정적 메서드) ==> " + B_2025_03_12_practice_4.currentCarCount());
        System.out.println("차의 최고 제한 속도 ==> " + B_2025_03_12_practice_4.MAXSPEED);
        
        // Math 클래스 활용 예제
        System.out.println("PI의 값 ==> " + Math.PI);
        System.out.println("3의 5제곱 ==> " + Math.pow(3, 5));

        // 각 자동차 객체 정보 출력
        System.out.println(myCar2.getColor() + ", " + myCar2.getSpeed());
        System.out.println(myCar3.getColor() + ", " + myCar3.getSpeed());
        System.out.println(iuCar.getColor() + ", " + iuCar.getSpeed());
        System.out.println(bkCar.getColor() + ", " + bkCar.getSpeed());
        
        // 속도 증가 및 출력
        bkCar.upSpeed(250);
        System.out.println(bkCar.getColor() + ", " + bkCar.getSpeed());
    }
}
