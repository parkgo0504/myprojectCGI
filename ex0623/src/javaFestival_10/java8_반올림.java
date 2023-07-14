package javaFestival_10;

import java.util.Scanner;

public class java8_반올림 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력 : ");
		int i = sc.nextInt();
		int sub = 0;
		if (i % 10 >= 5) {
			sub = i % 10;
			i = i - sub + 10;

		} else {
			sub = i % 10;
			i = i - sub;
		}
		System.out.println(i);

	}

}
