package javaFestival_10;

import java.util.Scanner;

public class java보너스_AB {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("A 입력 : ");
			int t = sc.nextInt();

			System.out.print("B 입력 : ");
			int g = sc.nextInt();
			if (t == 0 && g == 0) {
				break;
			}
			int sub = t - g;
			System.out.println("결과 >>" + sub);

		} while (true);

	}

}
