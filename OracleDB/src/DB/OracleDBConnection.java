package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleDBConnection {
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

            
            
            // 연결 종료
            connection.close();
            
            
            
            
            
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
