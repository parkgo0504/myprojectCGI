package for문;

import java.util.Scanner;

public class ex06_약수구하기 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력");
		
		int n = sc.nextInt();
		
		for(int i = 1; i<n+1; i++) {
			if(n % i == 0 ) {
				System.out.print(i+ " ");
			}
		}
	}
}
