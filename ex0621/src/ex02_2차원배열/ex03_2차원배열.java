package ex02_2차원배열;

import java.util.Arrays;

public class ex03_2차원배열 {

	public static void main(String[] args) {

		int[][] array = new int[5][5];

		int sum = 21;
		for (int i = 0; i < array.length; i++) { 
			for (int j = 0; j < array.length; j++) { 
					array[i][j] = sum++;
			}
		}
		for (int i = 0; i < array.length; i++) {
	
			for (int j = 0; j < array.length; j++) {
				if(i % 2== 0) {
					System.out.print(array[i][j] + " ");	
				}else { //
					System.out.print(array[i][4-j] + " ");	
				}
			}
			System.out.println();
		}

	}
}
