package BOONGTOL_TOJAVA;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class b_8_9_TextCopyEx {
    public static void main(String[] args){
        // ✅ macOS에서 존재하는 텍스트 파일로 경로 수정
        File src = new File("/Users/boongtol/Desktop/test.txt"); // 원본 파일
        File dest = new File("/Users/boongtol/Documents/copy_test"); // 복사본 파일

        int c;
        try {
            FileReader fr = new FileReader(src); // 파일 입력 문자 스트림
            FileWriter fw = new FileWriter(dest); // 파일 출력 문자 스트림

            while((c = fr.read()) != -1) {
                fw.write((char)c);
            }

            fr.close();
            fw.close();

            System.out.println(src.getPath() + "를 " + dest.getPath() + "로 복사하였습니다.");
        } catch (IOException e) {
            System.out.println("파일 복사 오류: " + e.getMessage());
        }
    }
}
