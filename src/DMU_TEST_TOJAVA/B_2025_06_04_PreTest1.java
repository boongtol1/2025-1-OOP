package DMU_TEST_TOJAVA;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class B_2025_06_04_PreTest1 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = 
                DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "lsh3500!");

            System.out.println("db okkkk");

            String sql = "insert into student values(?, ?, ?)";
            String inid = "202509";
            String inname = "이순하";
            String indept = "인공지능";

            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, inid);
            pstmt.setString(2, inname);
            pstmt.setString(3, indept);
            pstmt.executeUpdate();
            System.out.println(inname+"입력 성공");
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("db error");
            e.printStackTrace();
        }
    }
}
