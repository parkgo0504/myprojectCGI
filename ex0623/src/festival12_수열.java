import java.util.Scanner;
import java.util.Random;

public class festival12_수열 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("n 입력 : ");
		int n = sc.nextInt();

		int sum = 1;
		for (int i = 1; i < n + 1; i++) {
			System.out.print(sum + " ");
			sum += i;

		}

	}

}
