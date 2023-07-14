package 추상클래스;

public class HourWorker extends Worker {
	private int workDay;

	public HourWorker() {
	}

	public HourWorker(String name, int hourPay, int workHour, int workDay) {
		super(name, hourPay, workHour);
		setWorkDay(workDay);
	}

	public int getWorkDay() {
		return workDay;
	}

	public void setWorkDay(int workDay) {
		this.workDay = workDay;
	}

	@Override
	public int getPay() {
		return getHourPay() * getWorkHour() * getWorkDay();
	}
}
