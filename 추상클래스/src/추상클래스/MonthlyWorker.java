package 추상클래스;

public class MonthlyWorker extends Worker{

	public MonthlyWorker() {
	}

	public MonthlyWorker(String name, int hourPay, int workHour) {
		super(name, hourPay, workHour);
	}

	@Override
	public int getPay() {
		return getHourPay() * getWorkHour() * 20;
	}

}
