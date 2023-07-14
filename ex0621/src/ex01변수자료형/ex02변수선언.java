package ex01변수자료형;

import java.util.Scanner;

public class ex02변수선언 {

	public static void main(String[] args) {
		
		
		//코드 한줄 삭제 컨트로 d
		
		
		// 변수 선언하기
		int a;
		float b = 2;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		a= sc.nextInt();
		
		
		System.out.println(a);
		
		
		//한번 선언된 변수를 다시 사용할 때는 자료형을 다시 작성할 필요가 없다.
		//자바에서는 변수명을 중복으로 선언하는 것을 허용하지 않는다.
		
		
		//한번 데이터를 담으면 변하지 않는 공안을 선언
		// final 자료형 변수명 = 값;
		
		final int num2 = 18;
		System.out.println(num2);
		
		//java에서 변수명 작성 규칙
		//1. 키워드 구분 x
		//2. 길이 제한 없음 대소문자 구분
		//3. 숫자 시작 x
		//4. '_' '$' 만 사용
		
	}
}
