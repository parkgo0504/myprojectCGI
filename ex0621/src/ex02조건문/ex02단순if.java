package ex02조건문;

import java.util.Scanner;

public class ex02단순if {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력하세요 : ");
		int a = sc.nextInt();

		if (a % 3 == 0 && a % 5 == 0) { // 3과 5과 나눠지면 배수
			System.out.println("3과 5의 배수입니다");
		} else {
			System.out.println("3과 5의 배수아니다.");
		}

		// 15의 배수
		if (a % 15 == 0) {

		}

		// if문 여러개 사용
		if (a % 3 == 0) {
			if (a % 5 == 0) {

			}
		}
		// 코드 정렬
		// ctrl shift f

	}
}
