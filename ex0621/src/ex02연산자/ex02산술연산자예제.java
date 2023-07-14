package ex02연산자;

import java.util.Scanner;

public class ex02산술연산자예제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		
		int n = sc.nextInt();
		int c = (n /100)*100;
		int f = n-(n%100);
		System.out.println(c);
		System.out.println(f);
		
		
		
		
		
		
		
	}
}
