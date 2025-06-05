package BOONGTOL_TOJAVA;

import java.io.FileOutputStream;
import java.io.IOException;

public class b_8_5_FileOutputStreamEx {
    public static void main(String[] args) {
		byte b[] = {7,51,3,4,-1,8,77};
		
		try { 
			FileOutputStream fout = new FileOutputStream("/Users/boongtol/Desktop/test.txt");
			for(int i=0; i<b.length; i++)
				fout.write(b[i]); // 배열 b의 바이너리를 그대로 기록
			fout.close();
		} catch(IOException e) {
			System.out.println("c:\\Temp\\test.out에 저장할 수 없었습니다. 경로명을  확인해 주세요");
			return;//--> return?--> main 메서드의 종료를 의미한다!
		}
		System.out.println("c:\\Temp\\test.out을 저장하였습니다.");
	}
}


// OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream("output.txt"), "UTF-8");
// writer.write("안녕하세요"); 의 해석?--> output.txt 에 "안녕하세요" 라는 문자열을 바이트 형태로 저장!
