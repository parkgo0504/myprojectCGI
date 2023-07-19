package mvc;

import java.sql.*;
import java.util.ArrayList;

// Controller
class Controller {
	private Connection connection;
	private PreparedStatement psmt;

	public Controller() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String username = "service";
			String password = "12345";
			connection = DriverManager.getConnection(url, username, password);
			System.out.println("Oracle 데이터베이스에 연결되었습니다.");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public void closeResources() {
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

	public void signUp(Member member) {
		try {
			String sql = "INSERT INTO MEMBER VALUES (?, ?, ?, ?)";
			psmt = connection.prepareStatement(sql);
			psmt.setString(1, member.getId());
			psmt.setString(2, member.getPw());
			psmt.setString(3, member.getName());
			psmt.setInt(4, member.getAge());

			int rowsAffected = psmt.executeUpdate();

			if (rowsAffected > 0) {
				System.out.println("회원 가입이 완료되었습니다.");
			} else {
				System.out.println("회원 가입에 실패했습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeResources();
		}
	}

	public void login(String id, String pw) {

		try {
			String sql = "SELECT * FROM MEMBER WHERE ID = ? AND PW = ?";
			psmt = connection.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);

			
			ResultSet rs = psmt.executeQuery();
			if (rs.next()) {
				System.out.printf("%s 로그인 성공.\n", rs.getString("NAME"));
			} else {
				System.out.println("실패.");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeResources();
		}

	}

	public ArrayList<Member> showAllMembers() {
		ArrayList<Member> arr = new ArrayList<Member>();
		try {
			String sql = "SELECT * FROM MEMBER";
			psmt = connection.prepareStatement(sql);
			ResultSet rs = psmt.executeQuery();
			System.out.println("ID \t 이름 \t 나이");
			System.out.println("======================");
			while (rs.next()) {
				String id = rs.getString("ID");
				String name = rs.getString("NAME");
				int age = rs.getInt("AGE");
				Member member = new Member(id, "", name, age);
				arr.add(member);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeResources();
		}
		return arr;
	}


	public void searchMember(String id) {
		try {
			String sql = "SELECT * FROM MEMBER WHERE ID = ?";
			psmt = connection.prepareStatement(sql);
			psmt.setString(1, id);

			ResultSet rs = psmt.executeQuery();
			System.out.println("ID \t 이름 \t 나이");
			System.out.println("======================");
			while (rs.next()) {
				String memberId = rs.getString("ID");
				String name = rs.getString("NAME");
				int age = rs.getInt("AGE");

				System.out.println(memberId + "\t" + name + "\t" + age);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeResources();
		}
	}

	public void updateMember(String id, String pw, String newName) {
		try {
			String sql = "UPDATE MEMBER SET NAME = ? WHERE ID = ? AND PW = ?";
			psmt = connection.prepareStatement(sql);
			psmt.setString(1, newName);
			psmt.setString(2, id);
			psmt.setString(3, pw);

			int rowsAffected = psmt.executeUpdate();

			if (rowsAffected > 0) {
				System.out.println("회원 정보가 수정되었습니다.");
			} else {
				System.out.println("회원 정보 수정에 실패했습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeResources();
		}
	}

	public void withdrawMember(String id, String pw) {
		try {
			String sql = "SELECT * FROM MEMBER WHERE ID = ? AND PW = ?";
			psmt = connection.prepareStatement(sql);
			psmt.setString(1, id);
			psmt.setString(2, pw);

			ResultSet rs = psmt.executeQuery();

			if (rs.next()) {
				sql = "DELETE FROM MEMBER WHERE ID = ?";
				psmt = connection.prepareStatement(sql);
				psmt.setString(1, id);
				int rowsAffected = psmt.executeUpdate();

				if (rowsAffected > 0) {
					System.out.println("회원 탈퇴가 완료되었습니다.");
				} else {
					System.out.println("회원 탈퇴에 실패했습니다.");
				}
			} else {
				System.out.println("회원 탈퇴에 실패했습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeResources();
		}
	}
}
