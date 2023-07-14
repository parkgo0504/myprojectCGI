package while문;

import java.util.Scanner;

public class ex03_예제 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = 0;
		int even = 0, odd = 0;

		while (true) {
			System.out.print("숫자 입력 : ");
			n = sc.nextInt();

			if (n == -1) {
				System.out.println("종료되었습니다.");
				break;
			} else if (n % 2 == 0) {
				even += 1;
			} else {
				odd += 1;
			}
			System.out.println("짝수 개수 : " + even);
			System.out.println("홀수 개수 : " + odd);

		}

	}
}
