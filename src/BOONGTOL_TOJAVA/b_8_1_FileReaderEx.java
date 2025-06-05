package BOONGTOL_TOJAVA;

import java.io.FileReader;
import java.io.IOException;

public class b_8_1_FileReaderEx {
    public static void main(String[] args) {
		FileReader fin = null;
		try {
			fin = new FileReader("/Users/boongtol/Desktop/test.txt"); // 문자 입력 스트림 생성
			int c;
			while ((c = fin.read()) != -1) { // 한 문자씩 파일 끝까지 읽는다.
				System.out.print((char)c);
			}
			fin.close();
		}
		catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}
}

// try-catch 문에서 try 안에는 예외가 발생할 가능성이 있는 코드를 입력한다.
// catch 안에는 try 에서 예외가 발생했을때 출력할 것들을 적는다.
// 너 말처럼, try 안에서 예외가 발생하지 않으면 catch 블록은 아예 실행되지 않아. 곧 try 부분만 실행되고 만다.

// FileReader(클래스)는 파일 안의 "텍스트(문자)"를 한 글자씩 읽어오는 도구야.
// null은 "아무 객체도 가리키지 않는다"는 뜻이야.(참조형 변수에서 쓰는 것!)

// 첫째, 만약 fin을 try 문의 지역변수처럼 사용한다면, catch 문이나 finally 문에서 fin 을 사용하지 못한다.
// 둘째, fin 이 만약 null 인 상태에서 fin.close() 를 한다면, 예외가 발생!