package ex메소드;

import java.util.Scanner;

public class ex02메소드계산기2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수1 입력");
		int number1 = sc.nextInt();

		System.out.println("정수2 입력");
		int number2 = sc.nextInt();

		System.out.println("산술 기호 입력 : ");
		String s = sc.next();
		
		char op = s.charAt(0); // 문자열 첫번째 를 char op로 받는다
		System.out.println(cal(number1, number2,op));

	}

	public static int cal(int a, int b, char op) {

		int result = 0;
			
		switch (op) {
		case '+':
			result = a + b;
			break;
		case '-':
			if(a>b) {
				result = a - b;
				break;
			}else {
				result = b-a;
				break;
			}
		case '*':
			result = a * b;
			break;
		case '/':
			result = a / b;
			break;
		default:
			result =0;
			break;
		}
		
		return result;
	}
}
