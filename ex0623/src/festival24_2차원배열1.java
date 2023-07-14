import java.util.Scanner;
import java.util.Arrays;

public class festival24_2차원배열1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[][] array = new int[n][n];

		int sum = 1;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = sum;
				sum++;
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[j][i]+" ");
			}
			System.out.println();
		}

	}
}
