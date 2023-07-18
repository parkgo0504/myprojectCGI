package mvc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        while (true) {
            View.showMenu();
            Scanner sc = new Scanner(System.in);
            int menu = sc.nextInt();

            if (menu == 1) {
                Member member = View.getMemberInfo();
                controller.signUp(member);
            } else if (menu == 2) {
                controller.showAllMembers();
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
            } else if (menu == 0) {
                break;
            }
        }
    }
}