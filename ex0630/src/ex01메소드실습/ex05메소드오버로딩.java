package ex01메소드실습;

public class ex05메소드오버로딩 {

	public static void main(String[] args) {
		
		System.out.println(add(3,5));
		System.out.println(adddouble(3.3,3.5));
		
		
	}
	
//	1. 정수형 매개변수를 2개 받아서 더한 결과값을 되돌려주는 add메소드 생성
//	2. 실수형 매개변수를 2개 받아서 더한 결과값을 되돌려주는 adddouble 메소드 생성
	
	
	
	public static int add(int num1, int num2) {
		return num1 +num2;
		
	}
	public static int adddouble(double num1, double num2) {
		return (int)(num1 + num2);
		
	}
	
}

