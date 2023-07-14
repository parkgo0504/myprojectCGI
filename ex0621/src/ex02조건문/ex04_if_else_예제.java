package ex02조건문;

import java.util.Scanner;

public class ex04_if_else_예제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("나이를 입력하세요 : ");

		int f =5000 ; //요금 5000
		
		int age = sc.nextInt(); 

		System.out.print("인원수를 입력하세요 : ");
		int mem = sc.nextInt();
		
		if(age <20) { // 나이가 20 미만 이면 요금 깍기
			f = (int) (5000 * 0.5);
			System.out.println("총"+mem*f+"원입니다.");
		}else { //20 미만인 사람이 없으면 		
		
		//지역변수(local variable)
		// {} 변수는 영역을 벗어나서 사용 불가능
			System.out.println("총"+mem*f+"원입니다.");
		}
	}
}

