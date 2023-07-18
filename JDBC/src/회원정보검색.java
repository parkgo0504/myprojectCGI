import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class 회원정보검색 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String number = sc.next();

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

			String sql = "SELECT * FROM MEMBER WHERE ID = ? ";
			psmt = connection.prepareStatement(sql);
			psmt.setString(1, number);
			
			ResultSet rs = psmt.executeQuery();
			System.out.printf("id \t name \t age \n");
			System.out.printf("===========================\n");
			while (rs.next()) {
				String id = rs.getString("ID");
				String name = rs.getString("NAME");
				int age = rs.getInt("AGE");
				String pw = rs.getString("pw");

				System.out.printf(id + "\t" + name + "\t" + age + "\n");

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
