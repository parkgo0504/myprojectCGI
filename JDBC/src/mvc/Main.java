package mvc;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Controller controller = new Controller();
		Scanner sc = new Scanner(System.in);
		while (true) {
			View.showMenu();

			int menu = sc.nextInt();
			if (menu == 1) {
				Member member = View.getMemberInfo();
				controller.signUp(member);
			} else if (menu == 2) {
				controller.showAllMembers();

				Controller con = new Controller();
				ArrayList<Member> arr = con.showAllMembers();

				for (Member member : arr) {
					System.out.printf("%s\t %s\t %d\n", member.getId(), member.getName(), member.getAge());
				}

			} else if (menu == 3) {
				String id = View.getSearchId();
				controller.searchMember(id);
			} else if (menu == 4) {
				String id = View.getUpdateId();
				String pw = View.getUpdatePw();
				String newName = View.getUpdatedName();
				controller.updateMember(id, pw, newName);
			} else if (menu == 5) {
				String id = View.getWithdrawalId();
				String pw = View.getUpdatePw();
				controller.withdrawMember(id, pw);
			} else if (menu == 6) {
				String id = View.getIoginId();
				String pw = View.getIoginPw();

				controller.login(id, pw);

			} else if (menu == 0) {
				break;
			}
		}
	}
}