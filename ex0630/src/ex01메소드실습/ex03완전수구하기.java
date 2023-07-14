package ex01메소드실습;

import java.util.Scanner;

public class ex03완전수구하기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수1 입력");
		int number1 = sc.nextInt();

		boolean divisor = isDivisor(number1);

		System.out.println(divisor);
	}

	public static boolean isDivisor(int number1) {

		return sum(number1) == number1;

	}
	public static int sum(int number1) {
		int result = 1;

		for (int i = 2; i < number1; i++) {

			if (number1 % i == 0) {

				result += i;

			}

		}
		return result;

	}
}
