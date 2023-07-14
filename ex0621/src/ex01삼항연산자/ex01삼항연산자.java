package ex01삼항연산자;

import java.util.Scanner;

public class ex01삼항연산자 {

	public static void main(String[] args) {
		
	
		Scanner sc= new Scanner(System.in);
		
		
		System.out.print("첫 번재 정수를 입력하세요 : "); //scanner 입력
		int a= sc.nextInt();// a 에 받기
		
		System.out.print("두 번째 정수를 입력하세요 : "); //scanner 입력
		int b= sc.nextInt();// b 에 받기
		
		int result = (a>b)? a-b: b-a; // a> b a빼기 
		
		System.out.println("두수의 차 : "+ result);
		
		
		
	
		

		
		
		
		
		
	
	}
}
