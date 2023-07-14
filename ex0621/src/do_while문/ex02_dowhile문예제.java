package do_while문;

import java.util.Scanner;

public class ex02_dowhile문예제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("현재몸무게 : ");
		int t = sc.nextInt();

		System.out.print("목표몸무게 : ");
		int g = sc.nextInt();

		int i = 1;
		int sub = 0;
		do {
			System.out.print(i + "주차 감량 몸무게 : ");
			sub = sc.nextInt();
			i++;
			t -= sub;

		} while (t > g);
		System.out.println(t + "kg 달성!! 축하합니다.");

	}
}
