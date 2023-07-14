import java.util.Scanner;
import java.util.Random;

public class festival7 {
	public static void main(String[] args) {

		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		int stack = 0;

		do {
			int a = ran.nextInt(10);
			int b = ran.nextInt(10);
			int sum = a + b;

			System.out.print(a + " + " + b + " =");

			int result = sc.nextInt();

			if (result == sum) {
				System.out.println("Success");
			} else {
				System.out.println("Faile");

				stack++;
			}

		} while (stack < 5);
		System.out.println("GAME OVER!");

	}
}
