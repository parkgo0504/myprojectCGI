package ex01배열;

import java.util.Random;

public class ex05로또2 {

	public static void main(String[] args) {

		int array[] = new int[5];
		Random ran = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(5) + 1; // 0~4 배열 추가
			for (int j = 0; j < i; j++) {

				if (array[i] == array[j]) {
					array[i] = ran.nextInt(5) + 1;
					--i;

				}

			}

		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
