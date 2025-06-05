package DMU_TEST_TOJAVA;

public class B_2025_05_07_TimerRunnable implements Runnable {

    int n = 0;

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000); // 1초 대기
                n++;
                System.out.println(n); // 출력
            } catch (InterruptedException e) {
                e.printStackTrace();
                return; // 예외 발생 시 종료
            }
        }
    }

    public static void main(String[] args) {
        B_2025_05_07_TimerRunnable timer = new B_2025_05_07_TimerRunnable();
        Thread thread = new Thread(timer);
        thread.start(); // 스레드 시작
    }
}
