package ex01메소드실습;

import java.util.Scanner;

public class ex05피보나치수열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수1 입력");
		int number1 = sc.nextInt();

		// (첫 + 두) =result
		// 두 + result = result 2
		// result +result2 = result3

		int pr1 = 1; // 이전
		int pr2 = 1; // 전전
		
		System.out.print(pr1+" ");
		System.out.print(pr2+" ");

		for (int i = 3; i <= number1; i++) {
			int result = pr1 + pr2; // 현재
			System.out.print(result + " ");

			pr2 = pr1; //
			pr1 = result;
		}

	}
}
