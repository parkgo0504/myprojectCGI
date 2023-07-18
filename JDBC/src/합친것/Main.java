package 합친것;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Connection connection = null;
        PreparedStatement psmt = null;

        try {
            // JDBC 드라이버 로드
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // 데이터베이스 연결 정보 설정
            String url = "jdbc:oracle:thin:@localhost:1521:xe";
            String username = "service";
            String password = "12345";

            // 데이터베이스 연결 수립
            connection = DriverManager.getConnection(url, username, password);

            // 연결 성공 메시지 출력
            System.out.println("Oracle 데이터베이스에 연결되었습니다.");

            while (true) {
                System.out.println("1. 회원가입");
                System.out.println("2. 전체 회원 조회");
                System.out.println("3. 회원 정보 검색");
                System.out.println("4. 회원 정보 수정");
                System.out.println("5. 회원 탈퇴");
                System.out.println("0. 종료");
                System.out.print("메뉴 선택: ");
                int menu = sc.nextInt();

                if (menu == 1) {
                    // 회원 가입
                    System.out.print("ID: ");
                    String id = sc.next();

                    System.out.print("PW: ");
                    String pw = sc.next();

                    System.out.print("이름: ");
                    String name = sc.next();

                    System.out.print("나이: ");
                    int age = sc.nextInt();

                    String sql = "INSERT INTO MEMBER VALUES (?, ?, ?, ?)";
                    psmt = connection.prepareStatement(sql);
                    psmt.setString(1, id);
                    psmt.setString(2, pw);
                    psmt.setString(3, name);
                    psmt.setInt(4, age);

                    int rowsAffected = psmt.executeUpdate();

                    if (rowsAffected > 0) {
                        System.out.println("회원 가입 성공");
                    } else {
                        System.out.println("회원 가입 실패");
                    }
                } else if (menu == 2) {
                    // 전체 회원 조회
                    String sql = "SELECT * FROM MEMBER";
                    psmt = connection.prepareStatement(sql);
                    ResultSet rs = psmt.executeQuery();
                    System.out.println("id \t name \t age");
                    System.out.println("=====================");
                    while (rs.next()) {
                        String id = rs.getString("ID");
                        String name = rs.getString("NAME");
                        int age = rs.getInt("AGE");

                        System.out.println(id + "\t" + name + "\t" + age);
                    }
                } else if (menu == 3) {
                    // 회원 정보 검색
                    System.out.print("검색할 ID: ");
                    String id = sc.next();

                    String sql = "SELECT * FROM MEMBER WHERE ID = ?";
                    psmt = connection.prepareStatement(sql);
                    psmt.setString(1, id);

                    ResultSet rs = psmt.executeQuery();
                    System.out.println("id \t name \t age");
                    System.out.println("=====================");
                    while (rs.next()) {
                        String memberId = rs.getString("ID");
                        String name = rs.getString("NAME");
                        int age = rs.getInt("AGE");

                        System.out.println(memberId + "\t" + name + "\t" + age);
                    }
                } else if (menu == 4) {
                    // 회원 정보 수정
                    System.out.print("ID: ");
                    String id = sc.next();

                    System.out.print("PW: ");
                    String pw = sc.next();

                    System.out.print("변경할 이름: ");
                    String name = sc.next();

                    String sql = "UPDATE MEMBER SET NAME = ? WHERE ID = ? AND PW = ?";
                    psmt = connection.prepareStatement(sql);
                    psmt.setString(1, name);
                    psmt.setString(2, id);
                    psmt.setString(3, pw);

                    int rowsAffected = psmt.executeUpdate();

                    if (rowsAffected > 0) {
                        System.out.println("회원 정보 수정 성공");
                    } else {
                        System.out.println("회원 정보 수정 실패");
                    }
                } else if (menu == 5) {
                    // 회원 탈퇴
                    System.out.print("탈퇴할 ID: ");
                    String id = sc.next();

                    System.out.print("PW: ");
                    String pw = sc.next();

                    String sql = "SELECT * FROM MEMBER WHERE ID = ? AND PW = ?";
                    psmt = connection.prepareStatement(sql);
                    psmt.setString(1, id);
                    psmt.setString(2, pw);

                    ResultSet rs = psmt.executeQuery();

                    if (rs.next()) {
                        // 회원 탈퇴 성공
                        sql = "DELETE FROM MEMBER WHERE ID = ?";
                        psmt = connection.prepareStatement(sql);
                        psmt.setString(1, id);
                        int rowsAffected = psmt.executeUpdate();

                        if (rowsAffected > 0) {
                            System.out.println("회원 탈퇴 성공");
                        } else {
                            System.out.println("회원 탈퇴 실패");
                        }
                    } else {
                        // 회원 탈퇴 실패
                        System.out.println("회원 탈퇴 실패");
                    }
                } else if (menu == 0) {
                    // 종료
                    break;
                }
            }

            // 연결 종료
            connection.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (psmt != null) {
                    psmt.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
