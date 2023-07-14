package 통장;

public class BackMain {
	public static void main(String[] args) {

		Back b = new Back();
		
		
		b.deposit(1500);
		b.showMoney();
		b.withdraw(200);
		
		System.out.println("잔액 조회 : "+ b.showMoney());
		
		
	}
}
