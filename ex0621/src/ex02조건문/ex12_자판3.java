package ex02조건문;

import java.util.Scanner;

public class ex12_자판3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 입력하세요: ");
		int m = sc.nextInt();

		System.out.println("메뉴를 선택하세요: ");
		System.out.print("1. 겉옷 (700원) 2. 이구동성 (1000원) 3. 애그몽 (500원): ");
		int n = sc.nextInt();

		int s = 0;
		int a, b, c = 0;
		
		s=m;

		switch (n) {
		case 1: {
			s = m - 700;
			break;
		}
		case 2: {
			s = m - 1000;
			break;
		}
		case 3: {
			s = m - 500;
			break;
		}
		default:
			System.out.println("다시!");
			break;
		}

		if (s > 0) {
			System.out.println("잔돈 : " + s);
		} else {
			System.out.println("돈 부족");
			System.out.println("잔돈 : " + m);
		}

		if (s > 0) {
			a = s / 1000; // 1000원
			b = (s % 1000) / 500; // 500원
			c = (s % 500) / 100; // 100원
		} else {
			a = m / 1000; // 1000원
			b = (m % 1000) / 500; // 500원
			c = (m % 500) / 100; // 100원
		}

		System.out.println("천원 :" + a);
		System.out.println("오백원 :" + b);
		System.out.println("백원 :" + c);

	}
}
