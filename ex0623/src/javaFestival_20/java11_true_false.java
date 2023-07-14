package javaFestival_20;

import java.util.Scanner;

public class java11_true_false {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		int a =sc.nextInt();
		int b =sc.nextInt();
		
		boolean result = isDivide(a, b);
		System.out.println("결과 : " +result);
	}
	
	public static boolean isDivide(int a, int b) {
		
		if(a % b ==0) {
			return true;
		}else {
			return false;
		}
		
		
		
		
		
	}
}
