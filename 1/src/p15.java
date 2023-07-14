import java.util.Scanner;

public class p15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for (int i = 4; i >= 0; i--) {
			for (int j = 0; j < 5; j++) {
				if (i-j > 0) {
					System.out.print(" ");

				} else {
					System.out.print("*");
				}

			}
			System.out.println();
		}

	}
}
