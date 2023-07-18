import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class 회원정보수정 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("id: ");
		String id = sc.next();

		System.out.println("pw: ");
		String pw = sc.next();

		System.out.println("name: ");
		String name = sc.next();

		Connection connection = null;
		PreparedStatement psmt = null;
		PreparedStatement psmtu = null;

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
			String sqlu = "UPDATE MEMBER SET NAME = ? WHERE ID = ?";
			psmt = connection.prepareStatement(sql);
			psmtu = connection.prepareStatement(sqlu);

			
			
			psmt.setString(1, id);
			psmt.setString(2, pw);
			
			psmtu.setString(1, name);
			psmtu.setString(2, id);

			ResultSet rs = psmt.executeQuery();

			if (rs.next()) {
				// Login successful, do something
				System.out.printf("Login successful \n");

				
				psmtu.executeUpdate();

			} else {
				// Login failed, do something
				System.out.printf("Login failed");
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
