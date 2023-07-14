import java.util.Scanner;
import java.util.Random;

public class festival13_정수의합 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("단수 입력 : ");
		int n = sc.nextInt();

		System.out.println("어느 수까지 출력: ");
		int r = sc.nextInt();

		for (int i = 1; i < r + 1; i++) {
			System.out.println(n + "*" + i + "=" + n * i);
		}

	}

}
