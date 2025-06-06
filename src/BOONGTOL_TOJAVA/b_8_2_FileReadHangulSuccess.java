package BOONGTOL_TOJAVA;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_8_2_FileReadHangulSuccess {
    public static void main(String[] args) {
		InputStreamReader in = null;
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("/Users/boongtol/Desktop/test.txt");
			in = new InputStreamReader(fin, "MS949"); // 올바른 문자 집합 지정
			int c;

			System.out.println("인코딩 문자 집합은 " + in.getEncoding());
			while ((c = in.read()) != -1) {
				System.out.print((char)c);
			}
			in.close();
			fin.close();
		} catch (IOException e) {
			System.out.println("입출력 오류");
		}
	}
}
