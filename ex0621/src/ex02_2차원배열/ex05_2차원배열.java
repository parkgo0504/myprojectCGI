package ex02_2차원배열;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class ex05_2차원배열 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		// 5x5배열
		int[][] A = new int[n + 1][n + 1]; // 인덱스 1-5 사용
		int C = 1;

		// 전부 공백으로 초기화

		int start = n / 2;

		for (int i = -start; i <= start; i++) {
			for (int j = Math.abs(i) + 1; j < n + 1 - Math.abs(i); j++) {
				A[i + start + 1][j] = C;
				C++;
			}
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				System.out.print(A[i][j] + " ");
			}
			System.out.println();
		}

	}
}
