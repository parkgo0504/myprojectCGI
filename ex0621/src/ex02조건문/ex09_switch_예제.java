package ex02조건문;

import java.util.Scanner;

public class ex09_switch_예제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 입력 : ");
		int t = sc.nextInt();
		char g;
		switch(t/10) {
		
		case 10:
		case 9:
			g = 'A';
			break;
		case 8:
			g = 'B';
			break;
		case 7:
			g = 'C';
			break;
		default:
			g= 'D';
			break;
	}
		System.out.println(g+"학점입니다!");
	}
}
