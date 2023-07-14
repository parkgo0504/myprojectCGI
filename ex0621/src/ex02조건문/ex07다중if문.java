package ex02조건문;

import java.util.Scanner;

public class ex07다중if문 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("점수 입력 :");
		int t = sc.nextInt();
		char g;
		
		if(t >=90) {
			g= 'A';
		}else if (t>= 80) {
			g='B';
		}else if(t>=70) {
			g= 'C';
		}else {
			g='F';
		}
		System.out.println(g+"학점입니다!");
	}

}
