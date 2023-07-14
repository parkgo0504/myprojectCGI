package ex01메소드실습;

import java.util.Scanner;

public class ex01나누어지는수구하기2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수1 입력");
		int number1 = sc.nextInt();

		int sum1 = sum(number1);

		System.out.println(sum1);

	}

	public static int sum(int number1) {
		int result = 0;

		for (int i = 1; i < number1; i++) {

			if (number1 % i == 0) {

				result += i;

			}

		}
		return result;

	}
}
