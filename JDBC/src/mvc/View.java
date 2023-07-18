package mvc;

import java.util.Scanner;

public class View {

	public static void showMenu() {

		System.out.println("1. 회원가입");
		System.out.println("2. 전체 회원 조회");
		System.out.println("3. 회원 정보 검색");
		System.out.println("4. 회원 정보 수정");
		System.out.println("5. 회원 탈퇴");
		System.out.println("0. 종료");
		System.out.print("메뉴 선택: ");
	}

	public static Member getMemberInfo() {

		Scanner sc = new Scanner(System.in);

		System.out.print("ID: ");
		String id = sc.next();

		System.out.print("PW: ");
		String pw = sc.next();

		System.out.print("이름: ");
		String name = sc.next();

		System.out.print("나이: ");
		int age = sc.nextInt();

		return new Member(id, pw, name, age);

	}

	public static String getSearchId() {
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 ID: ");
		return sc.next();
	}

	public static String getUpdateId() {
		Scanner sc = new Scanner(System.in);
		System.out.print("수정 하고 싶은 ID: ");
		return sc.next();
	}

	public static String getUpdatePw() {
		Scanner sc = new Scanner(System.in);
		System.out.print("비민번호 확인 PW: ");
		return sc.next();
	}

	public static String getUpdatedName() {
		Scanner sc = new Scanner(System.in);
		System.out.print("변경 이름: ");
		return sc.next();
	}

	public static String getWithdrawalId() {
		Scanner sc = new Scanner(System.in);
		System.out.print("탈퇴할 ID: ");
		return sc.next();
	}

}
