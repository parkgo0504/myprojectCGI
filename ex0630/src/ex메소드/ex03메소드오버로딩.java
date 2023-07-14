package ex메소드;

import java.util.Scanner;

public class ex03메소드오버로딩 {

	public static void main(String[] args) {

		
		//메소드 오버로딩 중복정의 
		System.out.println(add(3.5, 5.5));
		System.out.println(add(0, 0));

	}

	public static double add(double a, double b) {

		double result = a + b;
		return result;

	}

	public static int add(int a, int b) {

		int result = a + b;
		return result;

	}
}
