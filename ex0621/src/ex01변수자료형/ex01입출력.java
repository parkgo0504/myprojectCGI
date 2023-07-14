package ex01변수자료형;

import java.util.Scanner;





public class ex01입출력 {

	public static void main(String[] args) {
	
		
		//java 출력
		System.out.println("Hello World!");
		//빨간줄 에러가 뜨면 마우스를 올려서 error 구문 확인
		
		//출력문 단축키(컨트롤 + 스페이스) (syso 출력)
		System.out.println("박기원");
	
		// 코드 블록 묶음 : snippet
		
		// 자바 입력문
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		
		int a = sc.nextInt();
		System.out.print("이름을 입력 : ");
		String s = sc.next();
		System.out.println(a);
		System.out.println(s);
		
		
		// import 단축키
		// : ctrl shift o
		// scan 컨트롤 스페이스
		
		// 코드 자동완성 보조도구 단축키
		// 컨트롤 스페이스
		
		
		
		
		
		
		
	}

}
