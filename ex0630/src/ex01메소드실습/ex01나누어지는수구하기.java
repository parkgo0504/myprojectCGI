package ex01메소드실습;

import java.util.Scanner;

public class ex01나누어지는수구하기 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수1 입력");
		int number1 = sc.nextInt();

		System.out.println("정수2 입력");
		int number2 = sc.nextInt();

		boolean divisor = isDivisor(number1, number2);

		System.out.println(divisor);
		
	}
	
	public static boolean isDivisor(int number1, int number2) {
		
		if(number1 % number2 ==0 ) {
			return true;
		}else {
			return false;
		}	
	}
}
