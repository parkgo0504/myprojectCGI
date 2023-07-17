
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class 회원가입 {
	public static void main(String[] args) {
		
	
		Connection connection = null;

		try {
			// JDBC 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 데이터베이스 연결 정보 설정
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String username = "service";
			String password = "12345";

			// 데이터베이스 연결
			connection = DriverManager.getConnection(url, username, password);

			// 연결 성공 메시지 출력
			System.out.println("Oracle 데이터베이스에 성공적으로 연결되었습니다.");

			
			
			
			String sql = "INSERT INTO MEMBER VALUES('test','test','test')";
			
			PreparedStatement psmt = connection.prepareStatement(sql);
			
			
			
			int row = psmt.executeUpdate();
			if(row > 1) {
				System.out.println("회원가입 성공");
			}else {
				System.out.println("회원가입 실패");
			}
			
			
			// 연결 종료
			connection.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
