package javaFestival_20;

import java.util.Random;
import java.util.Scanner;

public class java20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자 입력 ");
		int a = sc.nextInt();


		for (int i = 1; i < a + 1; i++) {
			System.out.println(a + "*" + i + "=" + (a * i));
		}

	}

}
