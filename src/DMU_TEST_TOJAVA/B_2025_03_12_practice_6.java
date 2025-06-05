package DMU_TEST_TOJAVA;

public class B_2025_03_12_practice_6 {
	 	String name;
	    int studId;
	    int age;

	    // 생성자
	    public B_2025_03_12_practice_6(String name, int studId, int age) {
	        this.name = name;
	        this.studId = studId;
	        this.age = age;
	    }

	    // 학생 정보 출력 메소드
	    public void displayInfo() {
	        System.out.println("이름: " + name + ", 학번: " + studId + ", 나이: " + age);
	    }

	    public static void main(String[] args) {
	        // 학생 객체 생성
	    	B_2025_03_12_practice_6 student1 = new B_2025_03_12_practice_6("김철수", 2025001, 20);
	    	B_2025_03_12_practice_6 student2 = new B_2025_03_12_practice_6("이영희", 2025002, 21);

	        // 학생 정보 출력
	        student1.displayInfo();
	        student2.displayInfo();
	    }
	}

	
