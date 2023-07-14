package ex메소드;

import java.util.Scanner;

public class ex04가까운수_찾기 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수1 입력");
		int number1 = sc.nextInt();

		System.out.println("정수2 입력");
		int number2 = sc.nextInt();

		int result = close10(number1, number2);

		System.out.println("10에 가까운 수 " + result);

	}

	public static int close10(int a, int b) {

		int result = 0;
		int num1;
		int num2;
		if (a > 0 && b > 0) { // 양수 더하기
			if (10 - a < 0) {
				num1 = -(10 - a);

			} else {
				num1 = 10 - a;
			}

			if (10 - b < 0) {
				num2 = -(10 - b);
			} else {
				num2 = 10 - b;
			}

			if (num1 == num2) {
				return result;
			} else {
				result = num1 > num2 ? b : a;
			}

		}

		else if (a < 0 && b < 0) {
			result = a > b ? a : b;
		}

		return result;

	}
}