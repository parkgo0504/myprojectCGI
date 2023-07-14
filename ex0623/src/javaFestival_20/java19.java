package javaFestival_20;

import java.util.Random;
import java.util.Scanner;

public class java19 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("단수 입력 ");
		int a = sc.nextInt();
		System.out.println("어느 수까지 출력 ");
		int b = sc.nextInt();

		for (int i = 1; i < b + 1; i++) {
			System.out.println(a + "*" + i + "=" + (a * i));
		}

	}

}
