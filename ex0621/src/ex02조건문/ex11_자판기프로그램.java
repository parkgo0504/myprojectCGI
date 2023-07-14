package ex02조건문;

import java.util.Scanner;

public class ex11_자판기프로그램 {

	public static void main(String[] args) {

		   Scanner sc = new Scanner(System.in);
	        System.out.println("금액을 입력하세요: ");
	        int m = sc.nextInt();

	        System.out.println("메뉴를 선택하세요: ");
	        System.out.print("1. 겉옷 (700원) 2. 이구동성 (1000원) 3. 애그몽 (500원): ");
	        int n = sc.nextInt();

	        int s = 0;
	        int a, b, c;
	        s = m;
	        if (n == 1) {
	            if (m >= 700) {
	                s = m - 700;
	                System.out.println("거스름돈: " + s);
	            } 
	            else {
	                System.out.println("돈이 부족합니다");
	                System.out.println("거스름돈: " + m);
	            }
	        } else if (n == 2) {
	            if (m >= 1000) {
	                s = m - 1000;
	                System.out.println("거스름돈: " + s);
	            } 
	            else {
	                System.out.println("돈이 부족합니다");
	                System.out.println("거스름돈: " + m);
	            }
	        } else if (n == 3) {
	            if (m >= 500) {
	                s = m - 500;
	                System.out.println("거스름돈: " + s);
	            } 
	            else {
	                System.out.println("돈이 부족합니다");
	                System.out.println("거스름돈: " + m);
	            }
	        
	        }
			a = s / 1000; // 1000원
			b = (s % 1000) / 500; // 500원
			c = (s % 500) / 100; // 100원
    		System.out.println("천원 :" + a);
    		System.out.println("오백원 :" + b);
    		System.out.println("백원 :" + c);
	    }
	
}
