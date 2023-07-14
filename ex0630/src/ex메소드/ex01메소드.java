package ex메소드;

public class ex01메소드 {

	public static void main(String[] args) {

		int a = name(1, 2);

		System.out.println(a);
		
		
		int s =Sub(5, 3);
		System.out.println(s);
		

		Number number1 = new Number();
		Number number2 = new Number();

		number1.num++;
		number1.num2++;

		System.out.println(number1.num); // 1
		System.out.println(number1.num2); // 1

		System.out.println(number2.num); // 1
		System.out.println(number2.num2); // 0

	}

	public static int name(int a, int b) {

		int result = a + b;

		return result;

	}

	public static double addDouble(double num1, double num2) {
		double result = num1 + num2;
		return result;

	}

	public static class Number {
		static int num = 0; // 클래스 필드
		int num2 = 0; // 인스턴스 필드
	}

	public static int Sub(int num1, int num2) {

		int result = 0;
		if (num1 > num2) {
			result = num1 - num2;
		} else {
			result = num2 - num1;
		}
		
//		result = num1 > num2 ? num1 - num2 : num2 - num1;

		return result;

	}

}
