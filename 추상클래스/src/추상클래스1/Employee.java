package 추상클래스1;

public abstract class Employee {

	protected String empno; // 사번
	protected String name; // 이름
	protected int pay; // 연봉

	public Employee(String empno, String name, int pay) {
		this.empno = empno;
		this.name = name;
		this.pay = pay;
	}

	public String print() {

		return empno + " : " + name + " : " + pay;

	}

	public abstract int getMoneyPay();

}
