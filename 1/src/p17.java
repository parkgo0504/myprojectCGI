import java.util.Scanner;

public class p17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();

		int number1 = sc.nextInt();

		for (int i = 1; i <= number1; i++) {

			System.out.println(number + " * " + i + "=" + (number * i));

		}

	}
}
