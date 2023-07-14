package for문;

import java.util.Scanner;

public class ex04_for문 {
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단 입력 : " );
		int n = sc.nextInt();
		for(int i= 1; i <10; i++) {
			System.out.printf("%d * %d = %d\n",n,i,(n*i));
		}
		
		
	}

}
