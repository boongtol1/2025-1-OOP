package DMU_TEST_TOJAVA;

public class B_2025_03_19_homework_StudentMain {
    public static void main(String[] args) {
        // 학생 객체 생성
        B_2025_03_19_homework_Student student = new B_2025_03_19_homework_Student(
            "홍길동", 
            "서울시 강남구", 
            "010-1234-5678", 
            "20230001", 
            "컴퓨터공학"
        );

        // 학생 정보 출력
        System.out.println("학생 정보:");
        System.out.println("==================");
        student.print();
    }
}
