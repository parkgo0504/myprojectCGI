import java.util.Scanner;

public class festival {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double hourlyWage = 5000; // 원 시급 설정
		double overtimeMultiplier = 1.5; // 초과 근무 시간에 대한 배수 설정

		System.out.print("근무 시간을 입력하세요: ");
		double hoursWorked = scanner.nextDouble();

		double totalWage;

		if (hoursWorked <= 8) {
			totalWage = hoursWorked * hourlyWage; // 근무 시간에 따른 임금 계산
		} else {
			double regularWage = 8 * hourlyWage; // 정규 근무 시간 임금 계산
			double overtimeHours = hoursWorked - 8; // 초과 근무 시간 계산
			double overtimeWage = overtimeHours * hourlyWage * overtimeMultiplier; // 초과 근무 시간 임금 계산
			totalWage = regularWage + overtimeWage; // 총 임금 계산
		}

		System.out.println("총 임금은 " + (int)totalWage + "원입니다.");

		scanner.close();
	}
}
