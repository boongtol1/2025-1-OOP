package DMU_TEST_TOJAVA;

import java.util.ArrayList;


public class B_2025_04_16_ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<String>();
        nameList.add("홍길동");
        nameList.add("이순신");     
        nameList.add("동미래");
        nameList.add("양관식");
        nameList.add("100");
        for(String name : nameList) {
            System.out.println(name);
        }
        
        ArrayList<Integer> ageList = new ArrayList<Integer>();   // int vs Integer 차이 인지하기!

        ageList.add(20);
        ageList.add(21);
        ageList.add(22);
        ageList.add(23);

        for (Integer age : ageList) {
            System.out.println(age);
        }

        ArrayList<B_2025_04_16_Student> studentList = new ArrayList<B_2025_04_16_Student>();
        B_2025_04_16_Student st1 = new B_2025_04_16_Student("홍길동", "1800001", "인공지능소프트웨어학과", "자바1");
        studentList.add(st1);
        studentList.add(new B_2025_04_16_Student("이순신", "1650001", "해양과", "지도력향상"));  
        studentList.add(new B_2025_04_16_Student("이승훈", "20231554", "인공지능소프트웨어학과", "자바2"));

        for (B_2025_04_16_Student student : studentList) {
            System.out.println(student);
        }
        System.out.println(" ***인공지능소프트웨어과 학생 목록***");
        for (B_2025_04_16_Student student : studentList) {
            if (student.getDept().equals("인공지능소프트웨어학과")) {
                System.out.println(student);
            }
        }
    }
}
