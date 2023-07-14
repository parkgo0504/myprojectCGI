package ex02_2차원배열;

import java.util.Arrays;
import java.util.Iterator;

public class ex01_2차원배열 {
	public static void main(String[] args) {

		int[][] show = new int[3][3]; // 선언

		System.out.println("array의 1번 인덱스 출력 " + show[2]);
		System.out.println(show[0][2]);

		int sum = 1;
		for (int i = 0; i < show.length; i++) { // 0,1,2
			for (int j = 0; j < show.length; j++) { // 0,1,2
				show[i][j] = sum; // 1,2,3,4,5,....
				sum++;
				System.out.print(show[i][j] + " ");
			}
			System.out.println();

		}
		System.out.println(Arrays.deepToString(show)); //deep은 2차원 배열 출력하는 함수

	}

}
