package BOONGTOL_TOJAVA;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class b_8_10_BinaryCopyEx {
    public static void main(String[] args) {
        // ✅ 원본 파일과 복사본 파일 경로 (macOS 경로로 수정)
        File src = new File("/Users/boongtol/Desktop/test.png");     // 원본 이미지
        File dest = new File("/Users/boongtol/Documents/copyimg.jpg");   // 복사본 이미지

        long start = System.currentTimeMillis(); // 복사 시작 시간
        int c;

        try {
            FileInputStream fi = new FileInputStream(src);  // 바이너리 파일 입력 스트림
            FileOutputStream fo = new FileOutputStream(dest); // 바이너리 파일 출력 스트림

            while ((c = fi.read()) != -1) {
                fo.write((byte) c); // 한 바이트씩 복사
            }

            fi.close();
            fo.close();

            long end = System.currentTimeMillis(); // 복사 완료 시간
            double seconds = (end - start) / 1000.0;

            System.out.println(src.getPath() + "를 " + dest.getPath() + "로 복사하였습니다.");
            System.out.println("복사 시간은 " + seconds + "초입니다.");

        } catch (IOException e) {
            System.out.println("파일 복사 오류: " + e.getMessage());
        }
    }
}
