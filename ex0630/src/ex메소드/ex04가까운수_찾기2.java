package ex메소드;

import java.util.Scanner;

public class ex04가까운수_찾기2 {

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

		int num1 =Math.abs(10-a);
		int num2 =Math.abs(10-b);
		
		
		
		if(num1 >num2) {
			return a;
		}else if(num1<num2) {
			return b;
		}else {
			return 0;
		}
		

	}
}