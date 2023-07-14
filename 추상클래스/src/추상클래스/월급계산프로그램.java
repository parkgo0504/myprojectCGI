package 추상클래스;

public class 월급계산프로그램 {

	public static void main(String[] args) {

		MonthlyWorker mw = new MonthlyWorker("Jhon", 7530, 6);
		HourWorker hw = new HourWorker("Peter", 7530, 5, 10);

		mw.showInfo();
		hw.showInfo();
	}
}
