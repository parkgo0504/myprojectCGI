package 추상클래스1;

public class PartTimeEmployee extends Employee {

	private int workDay; // 보너스

	public PartTimeEmployee(String empno, String name, int pay, int workDay) {
		super(empno, name, pay);

		this.workDay = workDay;
	}

	public int getMoneyPay() {
		return pay * workDay;
	}

}
