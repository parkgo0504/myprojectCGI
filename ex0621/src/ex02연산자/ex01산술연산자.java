package ex02연산자;

import java.util.Scanner;

public class ex01산술연산자 {

	public static void main(String[] args) {
		
		
		//산술 연산자
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수입력 : ");
		int num2 = sc.nextInt();
		
		int s = num1 + num2;
		int c = num1 - num2;
		int a = num1 * num2;
		double d = (double)num1 / num2;
		
		System.out.println("더한 결과 값 : "+s);
		System.out.println("뺀 결과 값 : "+c);
		System.out.println("곱한 결과 값 : "+a);
		System.out.println("나눈 결과 값 : "+d);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
