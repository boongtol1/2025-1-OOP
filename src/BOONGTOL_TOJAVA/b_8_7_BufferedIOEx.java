package BOONGTOL_TOJAVA;

import java.io.BufferedOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class b_8_7_BufferedIOEx {
    public static void main(String[] args) {
        FileReader fin = null;
        int c;
        try {
            fin = new FileReader("/Users/boongtol/Desktop/test.txt");
            BufferedOutputStream out = new BufferedOutputStream(System.out, 5); // 출력할때 다섯개의 문자가 모이면 출력해라의 설정 part!
            while ((c = fin.read()) != -1) { // 파일 데이터를 모두 스크린에 출력
                out.write(c); // write()는 👉 출력 버퍼에 데이터를 "저장"하는 역할
            }
            // 파일 데이터가 모두 출력된 상태
            new Scanner(System.in).nextLine(); // <Enter> 키 입력
            out.flush();    // 버퍼에 남아 있던 문자 모두 출력
            fin.close();
            out.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// 사용자가 입력한 "한 줄 전체"를 읽어서 문자열(String)로 반환하는 메서드야.