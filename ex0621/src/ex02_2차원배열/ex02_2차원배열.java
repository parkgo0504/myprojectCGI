package ex02_2차원배열;

import java.util.Arrays;

public class ex02_2차원배열 {

	public static void main(String[] args) {

		int[][] array = new int[5][5];

		int sum = 21;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[j][i] = sum++;
			}
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + " ");

			}
			System.out.println();
		}

	}
}
