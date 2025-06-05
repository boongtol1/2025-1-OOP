package BOONGTOL_TOJAVA;

import java.io.File;

public class b_8_8_FileEx {
    public static void listDirectory(File dir) {        // dir은 디렉토리(폴더)를 나타내는 File 객체야.

        System.out.println("----- " + dir.getPath() + "의 서브 리스트입니다. -----");  // dir.getPath()는 디렉토리의 전체 경로를 문자열로 가져옴

        File[] subFiles = dir.listFiles(); // subFiles 는 File 형태의 원소를 갖는 배열이다! , dir.listFiles()는 해당 디렉토리 안에 있는 모든 파일과 폴더를 File[] 배열로 반환하는 메서드야.
        if (subFiles == null) {
            System.out.println("디렉토리를 읽을 수 없습니다.");
            return;
        }

        for (File f : subFiles) {
            long t = f.lastModified(); // 마지막 수정 시간 // long은 64비트 정수!
            System.out.print(f.getName());
            System.out.print(f.isFile() ? "\t파일" : "\t디렉터리");
            System.out.print("\t파일 크기: " + f.length()); // 파일 크기 // f.length()는 File 객체 f가 가리키는 파일의 크기(바이트 단위) 를 반환해요. // 가 디렉토리(폴더) 인 경우, f.length()는 대부분 0을 반환해요.


            System.out.printf("\t수정한 시간:   %tb %td %ta %tT\n", t, t, t, t); // 날짜 포맷 출력
        }
    }

    public static void main(String[] args) {
        File f1 = new File("/Users/boongtol/Desktop/java");
        System.out.println(f1.getPath() + ", " + f1.getParent() + ", " + f1.getName());

        String res = "";
        if (f1.isFile()) res = "파일";
        else if (f1.isDirectory()) res = "디렉토리";
        System.out.println(f1.getPath() + "은(는) " + res + "입니다.");

        // macOS용 디렉토리 경로로 수정
        File f2 = new File("/Users/boongtol/Desktop/java");

        if (!f2.exists()) {   // f2 가 폴더든 파일이든 존재하지 않는다면... 이란 뜻
            f2.mkdir(); // 디렉토리가 없다면 생성(생성되는 폴더 이름은 java)
        }

        listDirectory(new File("/Users/boongtol/Desktop")); // mac의 Desktop 디렉토리 출력

        // 디렉토리 이름 변경
        f2.renameTo(new File("/Users/boongtol/Desktop/javaaaaa"));  

        listDirectory(new File("/Users/boongtol/Desktop"));
    }


}

// 자바의 File 클래스는 "파일"과 "폴더(디렉토리)" 모두를 표현할 수 있는 객체입니다.


// renameTo()--> 파일 또는 폴더의 이름 변경 or 경로 이동!