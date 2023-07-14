package for문;

import java.util.Scanner;

public class ex05_for문 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단 입력: ");
		int a = sc.nextInt();
		System.out.print("어느 수까지 출력: ");
		int b = sc.nextInt();
		
		for(int i=1; i<b+1; i++) {
			System.out.println(a+" * "+i+" = "+(a*i));
		}
		
		
	}
}
