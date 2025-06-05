package BOONGTOL_TOJAVA;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class b_8_11_BlockBinaryCopyEx {
    public static void main(String[] args) {
        // ✅ macOS용 경로로 수정 (사용자 이름은 boongtol로 가정)
        File src = new File("/Users/boongtol/Desktop/test.png");     // 원본 파일
        File dest = new File("/Users/boongtol/Desktop/copyimg.jpg");   // 복사 파일

        long start = System.currentTimeMillis(); // 복사 시작 시간

        try {
            FileInputStream fi = new FileInputStream(src);     // 원본 파일 입력 스트림 (바이트 단위)
            FileOutputStream fo = new FileOutputStream(dest);  // 복사본 파일 출력 스트림 (바이트 단위)

            byte[] buf = new byte[1024 * 10]; // 💡 10KB 버퍼 만들기 (10240 바이트)

            while (true) {
                int n = fi.read(buf); // 최대 10KB만큼 읽기 (n: 실제 읽은 바이트 수) // 파일에서 데이터를 최대 buf.length 바이트만큼 읽어서 buf 배열에 저장하는 명령입니다.

                if (n == -1) break;   // 파일 끝이면 종료

                fo.write(buf, 0, n);  // buf[0]부터 n바이트만큼 복사본에 쓰기

                if (n < buf.length)
                    break; // 읽은 양이 버퍼보다 작으면 → 파일 끝! → 복사 종료
            }

            fi.close();  // 입력 스트림 닫기
            fo.close();  // 출력 스트림 닫기

            long end = System.currentTimeMillis(); // 복사 끝난 시간
            double seconds = (end - start) / 1000.0; // 복사 시간 계산 (초 단위)
            System.out.println(src.getPath() + "를 " + dest.getPath() + "로 복사하였습니다.");
            System.out.println("복사 시간은 " + seconds + "초입니다.");

        } catch (IOException e) {
            System.out.println("파일 복사 오류: " + e.getMessage());
        }
    }
}

// 마지막 반복에서 읽은 양이 10KB보다 작을 수 있어