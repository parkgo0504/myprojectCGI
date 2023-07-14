package ex02조건문;

import java.util.Scanner;

public class ex05_ifelse_문제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("상품의 개수를 입력하세요 : ");
		
		
		int count = sc.nextInt();
		int f = 10000;
		int c= f*count;
		
		
		if(count >= 11) {		
			c= c-(int) (c * 0.1);			
			System.out.println("가격은 "+c+"원입니다.");
		}else {	
			System.out.println("가격은 "+c+"원입니다.");
		}
	}
}
