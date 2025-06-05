package DMU_TEST_TOJAVA;

public class B_2025_05_07_TimerTheread extends Thread {
    int n = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println(n); // 출력
            n++;                   // 증가

            try {
                Thread.sleep(1000); // 1초 대기
            } catch (InterruptedException e) {
                e.printStackTrace(); // 예외 처리
                return; // 예외 발생 시 스레드 종료
            }
        }
    }

    public static void main(String[] args) {
        B_2025_05_07_TimerTheread timer = new B_2025_05_07_TimerTheread();
        timer.start(); // 스레드 실행
    }
}
