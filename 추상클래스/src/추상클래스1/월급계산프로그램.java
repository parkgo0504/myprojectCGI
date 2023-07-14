package 추상클래스1;

public class 월급계산프로그램 {

	public static void main(String[] args) {

		Employee[] employee = new Employee[3];

		employee[0] = new RegularEmployee("SMHRD001", "홍0동", 4000, 400);
		employee[1] = new TempEmployee("SMHRD002", "박0수", 3000);
		employee[2] = new PartTimeEmployee("SMHRD001", "김0독 ", 10, 10);

		for (Employee x : employee) {

			System.out.println(x.print());
			System.out.println(x.getMoneyPay()+"만원");

		}

	}
}
