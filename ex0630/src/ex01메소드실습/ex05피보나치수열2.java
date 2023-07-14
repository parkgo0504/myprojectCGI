package ex01메소드실습;

import java.util.Scanner;

public class ex05피보나치수열2 {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정수1 입력");
//		int number1 = sc.nextInt();

		// (첫 + 두) =result
		// 두 + result = result 2
		// result +result2 = result3

		System.out.println(fibo(6));
	}

//	public static int fibo(int number1) {
//
//		int a[] = new int[number1];
//
//		if (number1 > 0) {
//			a[0] = 1;
//		}
//		if (number1 > 1) {
//			a[1] = 1;
//		}
//
//		for (int i = 2; i < number1; i++) {
//
//			a[i] = a[i - 2] + a[i - 1];
//
//		}
//		return a[number1 - 1];
//
//	}
	public static int fibo(int num) {

		// 1,1,2,3,5

		int first = 1, sec = 1, sum = 0;

		if (num <= 2) {
			return 1;
		} else {

			return fibo(num - 2) + fibo(num - 1);
		}

	}

}
