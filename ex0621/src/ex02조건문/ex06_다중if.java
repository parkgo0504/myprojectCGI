package ex02조건문;

import java.util.Scanner;

public class ex06_다중if {

	public static void main(String[] args) {
		
		
		//사용자로부터 숫자를 입력받아서 해당하는 숫자가 0인지 홀수 짝수
		Scanner sc = new Scanner(System.in);
		System.out.print("입력");
		
		int n = sc.nextInt();
		
		if(n % 2 ==1) {
			System.out.println("홀수");
		}
		else if(n == 0){
			System.out.println("0");
		}
		else if(n % 2== 0) {
			System.out.println("짝수");
			
		}
		else {
			System.out.println("마이너스");
		}
		
		
	}
}
