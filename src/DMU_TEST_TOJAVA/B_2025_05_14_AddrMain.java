package DMU_TEST_TOJAVA;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class B_2025_05_14_AddrMain {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<B_2025_05_14_Addr> addrList = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.println("--------------------------");
            System.out.println("1. 주소록 입력");
            System.out.println("2. 주소록 검색");
            System.out.println("3. 주소록 조회");
            System.out.println("4. 주소록 수정");
            System.out.println("5. 주소록 삭제");
            System.out.println("0. 종료");
            System.out.println("--------------------------");
            System.out.print("메뉴를 입력하세요: ");
            int in = -1;
            try {
                in = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                // 잘못된 입력 무시
            }

            switch (in) {
                case 1: addrInput(); break;
                case 2: addrSearch(); break;
                case 3: addrView(); break;
                case 4: addrUpdate(); break;
                case 5: addrDelete(); break;
                case 0:
                    System.out.println("프로그램을 종료합니다.");
                    sc.close();
                    return;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력하세요.");
            }
        }
    }

    // 1. 주소록 입력
    public static void addrInput() {
        System.out.print("이름을 입력하세요: ");
        String name = sc.nextLine();

        System.out.print("전화번호를 입력하세요: ");
        String tel = sc.nextLine();

        System.out.print("회사 이름을 입력하세요: ");
        String com = sc.nextLine();

        LocalDateTime now = LocalDateTime.now();
        B_2025_05_14_Addr addr = new B_2025_05_14_Addr(name, tel, com, now);
        addrList.add(addr);

        System.out.println("주소록이 저장되었습니다.\n");
    }

    // 2. 주소록 검색 (이름 일부 포함 검색)
    public static void addrSearch() {
        System.out.print("검색할 이름을 입력하세요. (like검색): ");
        String keyword = sc.nextLine();

        for (B_2025_05_14_Addr addr : addrList) {
            if (addr.getName().contains(keyword)) {
                System.out.println(addr);
            }
        }
    }

    // 3. 주소록 전체 조회
    public static void addrView() {
        System.out.println("전체 주소록:");
        for (B_2025_05_14_Addr addr : addrList) {
            System.out.println(addr);
        }
    }

    // 4. 주소록 수정
    public static void addrUpdate() {
        System.out.print("수정할 이름을 입력하세요: ");
        String name = sc.nextLine();

        for (B_2025_05_14_Addr addr : addrList) {
            if (addr.getName().equals(name)) {
                System.out.print("새 전화번호: ");
                addr.setTel(sc.nextLine());

                System.out.print("새 회사 이름: ");
                addr.setCom(sc.nextLine());

                addr.setCreateDate(LocalDateTime.now());
                System.out.println("수정 완료.");
                return;
            }
        }
        System.out.println("해당 이름을 찾을 수 없습니다.");
    }

    // 5. 주소록 삭제
    public static void addrDelete() {
        System.out.print("삭제할 이름을 입력하세요: ");
        String name = sc.nextLine();

        for (int i = 0; i < addrList.size(); i++) {
            if (addrList.get(i).getName().equals(name)) {
                addrList.remove(i);
                System.out.println("삭제 완료.");
                return;
            }
        }
        System.out.println("해당 이름을 찾을 수 없습니다.");
    }
}