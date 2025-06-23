package for_test_exercise;

// Swing GUI 구성 요소를 사용하기 위한 임포트
import javax.swing.*;
// AWT 레이아웃 및 이벤트 처리를 위한 임포트
import java.awt.*;
// 이벤트 리스너를 위한 임포트
import java.awt.event.*;
// MySQL 데이터베이스 연결을 위한 임포트
import java.sql.*;

// JFrame을 상속받아 GUI 창을 생성하는 클래스
public class test_java_alone extends JFrame {

    // GUI에 표시될 이름 라벨
    private JLabel label_name = new JLabel("이름");
    // GUI에 표시될 전화번호 라벨
    private JLabel label_phonenum = new JLabel("전화번호");
    // GUI에 표시될 회사이름 라벨
    private JLabel label_companyname = new JLabel("회사이름");

    // 이름 입력을 위한 텍스트 필드
    private JTextField field_name = new JTextField("");
    // 전화번호 입력을 위한 텍스트 필드
    private JTextField field_phonenum = new JTextField("");
    // 회사이름 입력을 위한 텍스트 필드
    private JTextField field_companyname = new JTextField("");

    // 데이터 입력 버튼
    private JButton btn1 = new JButton("입력");
    // 전체 데이터 조회 버튼
    private JButton btn2 = new JButton("조회");
    // ID로 데이터 검색 버튼
    private JButton btn3 = new JButton("검색");
    // 데이터 수정 버튼
    private JButton btn4 = new JButton("수정");
    // 데이터 삭제 버튼
    private JButton btn5 = new JButton("삭제");
    // 프로그램 종료 버튼
    private JButton btn6 = new JButton("종료");

    // MySQL 데이터베이스 연결을 위한 Connection 객체
    private Connection conn;

    // 생성자: GUI 창과 데이터베이스 연결을 초기화
    test_java_alone() {
        // 창 제목 설정
        setTitle("homework");
        // 창 닫기 버튼 클릭 시 프로그램 종료
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // 6행 2열의 그리드 레이아웃 설정 (간격: 수평 0, 수직 5)
        setLayout(new GridLayout(6, 2, 0, 5));

        // 이름 라벨을 GUI에 추가
        this.add(label_name);
        // 이름 입력 필드를 GUI에 추가
        this.add(field_name);
        // 전화번호 라벨을 GUI에 추가
        this.add(label_phonenum);
        // 전화번호 입력 필드를 GUI에 추가
        this.add(field_phonenum);
        // 회사이름 라벨을 GUI에 추가
        this.add(label_companyname);
        // 회사이름 입력 필드를 GUI에 추가
        this.add(field_companyname);
        // 입력 버튼을 GUI에 추가
        this.add(btn1);
        // 조회 버튼을 GUI에 추가
        this.add(btn2);
        // 검색 버튼을 GUI에 추가
        this.add(btn3);
        // 수정 버튼을 GUI에 추가
        this.add(btn4);
        // 삭제 버튼을 GUI에 추가
        this.add(btn5);
        // 종료 버튼을 GUI에 추가
        this.add(btn6);

        // 데이터베이스 연결 설정
        try {
            // MySQL 데이터베이스에 연결 (localhost, mydb 데이터베이스, 사용자 root, 비밀번호 lsh3500!)
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "lsh3500!");
        } catch (Exception e) {
            // 연결 실패 시 오류 메시지 표시
            JOptionPane.showMessageDialog(null, "DB 연결 실패");
        }

        // 입력 버튼 클릭 이벤트 처리
        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // 입력 필드에서 이름, 전화번호, 회사이름 가져오기
                    String name = field_name.getText();
                    String phonenum = field_phonenum.getText();
                    String companyname = field_companyname.getText();
                    // 데이터베이스에 데이터를 삽입하는 SQL 쿼리
                    String sql = "INSERT INTO addressbook(name, tel, com) VALUES ('" + name + "', '" + phonenum + "', '" + companyname + "')";
                    // SQL 실행을 위한 Statement 객체 생성
                    Statement stmt = conn.createStatement();
                    // 삽입 쿼리 실행
                    stmt.executeUpdate(sql);    // (수정)
                    // 성공 메시지 표시
                    JOptionPane.showMessageDialog(null, "입력 완료");
                } catch (Exception ex) {
                    // 입력 실패 시 오류 메시지 표시
                    JOptionPane.showMessageDialog(null, "입력 실패");
                }
            }
        });

        // 조회 버튼 클릭 이벤트 처리
        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // 모든 데이터(id, name, tel, com)를 조회하는 SQL 쿼리
                    String sql = "SELECT id, name, tel, com FROM addressbook";
                    // SQL 실행을 위한 Statement 객체 생성
                    Statement stmt = conn.createStatement();
                    // 조회 쿼리 실행
                    ResultSet rs = stmt.executeQuery(sql);  // rs 에는 테이블이 저장됨! (조회)
                    // 조회 결과를 저장할 문자열
                    String result = "";
                    // 결과 집합을 순회하며 각 레코드를 문자열로 구성  // 
                    while (rs.next()) {
                        result += rs.getInt("id") + ": " + rs.getString("name") + ", " + rs.getString("tel") + ", " + rs.getString("com") + "\n";
                    }
                    // 결과가 비어있으면 "데이터 없음", 그렇지 않으면 결과 표시
                    JOptionPane.showMessageDialog(null, result.isEmpty() ? "데이터 없음" : result);
                } catch (Exception ex) {
                    // 조회 실패 시 오류 메시지 표시
                    JOptionPane.showMessageDialog(null, "조회 실패");
                }
            }
        });

        // 검색 버튼 클릭 이벤트 처리
        btn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // 사용자에게 검색할 ID 입력 다이얼로그 표시
                    String idInput = JOptionPane.showInputDialog("검색할 ID를 입력하세요:");
                    // 입력이 취소되면 종료
                    if (idInput == null) return;
                    // 입력된 ID를 정수로 변환
                    int id = Integer.parseInt(idInput);
                    // ID로 데이터를 조회하는 SQL 쿼리
                    String sql = "SELECT name, tel, com FROM addressbook WHERE id = " + id;
                    // SQL 실행을 위한 Statement 객체 생성
                    Statement stmt = conn.createStatement();
                    // 조회 쿼리 실행
                    ResultSet rs = stmt.executeQuery(sql);  // rs 에는 테이블이 저장됨!
                    // 결과가 있으면 데이터를 표시
                    if (rs.next()) {
                        String result = rs.getString("name") + ", " + rs.getString("tel") + ", " + rs.getString("com");
                        JOptionPane.showMessageDialog(null, "검색 성공: " + result);
                    } else {
                        // 결과가 없으면 메시지 표시
                        JOptionPane.showMessageDialog(null, "검색 결과 없음");
                    }
                } catch (Exception ex) {
                    // 검색 실패 시 오류 메시지 표시
                    JOptionPane.showMessageDialog(null, "검색 실패");
                }
            }
        });

        // 수정 버튼 클릭 이벤트 처리
        btn4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // 사용자에게 수정할 ID 입력 다이얼로그 표시
                    String idInput = JOptionPane.showInputDialog("수정할 ID를 입력하세요:");
                    // 입력이 취소되면 종료
                    if (idInput == null) return;
                    // 입력된 ID를 정수로 변환
                    int id = Integer.parseInt(idInput);
                    // 입력 필드에서 이름, 전화번호, 회사이름 가져오기
                    String name = field_name.getText();
                    String tel = field_phonenum.getText();
                    String com = field_companyname.getText();
                    // 데이터를 수정하는 SQL 쿼리
                    String sql = "UPDATE addressbook SET name = '" + name + "', tel = '" + tel + "', com = '" + com + "' WHERE id = " + id;
                    // SQL 실행을 위한 Statement 객체 생성
                    Statement stmt = conn.createStatement();
                    // 수정 쿼리 실행
                    int result = stmt.executeUpdate(sql);   // result 는 변경된 행 개수 의미!
                    // 수정된 행이 있으면 성공, 없으면 실패 메시지 표시
                    JOptionPane.showMessageDialog(null, result > 0 ? "수정 완료" : "수정할 데이터가 없습니다");
                } catch (Exception ex) {
                    // 수정 실패 시 오류 메시지 표시
                    JOptionPane.showMessageDialog(null, "수정 실패");
                }
            }
        });

        // 삭제 버튼 클릭 이벤트 처리
        btn5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    // 사용자에게 삭제할 ID 입력 다이얼로그 표시
                    String idInput = JOptionPane.showInputDialog("삭제할 ID를 입력하세요:");
                    // 입력이 취소되면 종료
                    if (idInput == null) return;
                    // 입력된 ID를 정수로 변환
                    int id = Integer.parseInt(idInput);
                    // 데이터를 삭제하는 SQL 쿼리
                    String sql = "DELETE FROM addressbook WHERE id = " + id;
                    // SQL 실행을 위한 Statement 객체 생성
                    Statement stmt = conn.createStatement();
                    // 삭제 쿼리 실행
                    int result = stmt.executeUpdate(sql);
                    // 삭제된 행이 있으면 성공, 없으면 실패 메시지 표시
                    JOptionPane.showMessageDialog(null, result > 0 ? "삭제 완료" : "삭제할 데이터가 없습니다");
                } catch (Exception ex) {
                    // 삭제 실패 시 오류 메시지 표시
                    JOptionPane.showMessageDialog(null, "삭제 실패");
                }
            }
        });

        // 종료 버튼 클릭 이벤트 처리
        btn6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // 프로그램 종료
                System.exit(0);
            }
        });

        // 창 크기 설정 (400x300)
        setSize(400, 300);
        // 창 표시
        setVisible(true);
    }

    // 프로그램 진입점
    public static void main(String[] args) {
        // 새로운 GUI 인스턴스 생성
        new test_java_alone();
    }
}


// 자바에서 DB에 명령을 보내려면,
// 1. Connection으로 통신 다리를 놓고
// 2. Statement로 SQL을 실어 보낼 택배차를 만들고
// 3. executeUpdate()로 출발 버튼을 눌러야 한다.

// 출발 버튼 (executeUpdate(sql))을 누르면,
// 자바 세계에서 만든 SQL 문이 데이터베이스 세계로 “배송”되어 도착하고,
// 거기서 실제로 작동(처리)된다.

// 프로그램 시작(main() → new JFrame): 화면 생성
// addActionListener(...) 실행: 버튼에 이벤트 연결함
// 대기 중...: 버튼 안 누르면 아무 일 없음
// 사용자가 버튼 클릭!: actionPerformed() 가 이때 실행됨

// result 는 변경된 행 개수 의미: Statement.executeUpdate(sql)의 결과로 INSERT, UPDATE, DELETE에 의해 영향을 받은 행 수
// rs 에는 테이블이 저장됨: ResultSet 객체로 SELECT 결과로 반환된 테이블 데이터를 담음
// rs.next(): 다음 행으로 커서를 이동시키고, 이동한 행이 존재하면 true 리턴
// while (rs.next()): 읽을 행이 더 있을 동안 반복하며, 한 줄씩 읽고 내려가는 루프
// → SELECT된 결과가 여러 행일 경우, 각 행을 한 번씩 순서대로 처리할 수 있게 해줌

// conn.createStatement(): DB에 SQL 명령을 보낼 Statement 객체 생성
// stmt.executeUpdate(sql): SQL 명령을 실제로 실행 (INSERT, UPDATE, DELETE)

// while (i < 3): 단순히 조건만 평가, i++은 우리가 직접 실행해야 함
// while (rs.next()): 조건 평가 전에 커서를 다음 행으로 직접 이동시킴
// if (rs.next()): 다음 행이 존재하면 true → SELECT 결과가 1개 이상일 때 if로도 처리 가능
// rs.getString("name"): 현재 행의 "name" 열 값을 가져옴
