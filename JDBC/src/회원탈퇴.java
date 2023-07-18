import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class 회원탈퇴 {

	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("탈퇴 id: ");
        String id = sc.next();

        System.out.println("pw: ");
        String pw = sc.next();



        Connection connection = null;
        PreparedStatement psmt = null;

        try {
            // Load the JDBC driver
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // Set database connection information
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String username = "service";
            String password = "12345";

            // Establish database connection
            connection = DriverManager.getConnection(url, username, password);

            // Print connection success message
            System.out.println("Successfully connected to Oracle database");

            String sql = "SELECT * FROM MEMBER WHERE ID = ? AND PW = ?";

            psmt = connection.prepareStatement(sql);
            psmt.setString(1, id);
            psmt.setString(2, pw);


            ResultSet rs = psmt.executeQuery();

            if (rs.next()) {
                // Login successful, do something
                System.out.println("회원 탈퇴 성공");
                sql = "DELETE FROM MEMBER WHERE ID = ?";
                psmt.setString(1, id);
 
                
            } else {
                // Login failed, do something
                System.out.println("회원 탈퇴 실패");
            }

          
            // Close the connection
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
