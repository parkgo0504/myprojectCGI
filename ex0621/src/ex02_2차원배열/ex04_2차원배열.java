package ex02_2차원배열;

import java.util.Arrays;

public class ex04_2차원배열 {

	public static void main(String[] args) {
		int[][] array = new int[5][5];
		int startValue = 21;

		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) { // i 가 짝수 일대 그대로
				
				for (int j = 0; j < array[i].length; j++) {
					array[j][i] = startValue++; //00 10 20 30 40
				}
			} else {
				for (int j = array[i].length - 1; j >= 0; j--) {
					array[j][i] = startValue++;  //41 31 21 11 01
				}
			}
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}

}
