package javaFestival_20;

import java.util.Scanner;

public class java14_2차원배열2 {

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
				if (i % 2 == 0) {
					System.out.print(array[i][j] + " ");
				} else {
					System.out.print(array[i][4 - j] + " ");
				}

			}
			System.out.println();
		}

	}

}
