import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class 회원가입 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("id: ");
        String id = sc.next();

        System.out.println("pw: ");
        String pw = sc.next();

        System.out.println("name: ");
        String name = sc.next();

        System.out.println("age: ");
        int age = sc.nextInt();

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

            String sql = "INSERT INTO MEMBER VALUES(?, ?, ?, ?)";

            psmt = connection.prepareStatement(sql);
            psmt.setString(1, id);
            psmt.setString(2, pw);
            psmt.setString(3, name);
            psmt.setInt(4, age);

            int rowsAffected = psmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Registration successful");
            } else {
                System.out.println("Registration failed");
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
