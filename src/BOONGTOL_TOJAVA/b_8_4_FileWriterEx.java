package BOONGTOL_TOJAVA;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class b_8_4_FileWriterEx {
    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		FileWriter fout = null;
		try {
			fout = new FileWriter("/Users/boongtol/Desktop/test.txt"); // 파일과 연결된 출력 문자 스트림 생성
			while(true) {
				String line = scanner.nextLine();
				if(line.length() == 0) // 한 줄에 <Enter>키만 입력한 경우
					break;
				fout.write(line, 0, line.length()); 
				fout.write("\r\n", 0, 2); // \r\n을 파일에 기록
			}
			fout.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
		scanner.close();
	}
}

// FileWriter는 문자(글자)를 파일에 쓰는 도구예요.(문자든 문자열이든 모두 저장 가능!)

// 메모장은 \r\n 조합을 **"줄바꿈"**으로 해석하기 때문!--> 이것때문에 넘 스트레스 받지 않기!

