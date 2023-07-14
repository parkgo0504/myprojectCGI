import java.util.Scanner;

public class p11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("행 개수");

		int n = sc.nextInt();

		for (int i = n-1; i >=0; i--) {
			for (int j = 0; j <i; j++) {

				System.out.print("*");
			}
			System.out.println();
		}

	}
}
