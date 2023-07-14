package javaFestival_10;

import java.util.Random;

public class java10_큰값_작은값 {

	public static void main(String[] args) {

		int array[] = new int[8];
		Random ran = new Random();

		int max = 0;

		System.out.print("배열에 있는 모든 값 :");
		for (int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(60) + 1;
			System.out.print(array[i] + " ");
		}

		int min = array[0];

		System.out.println();
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];

			}
			if (min > array[i]) {
				min = array[i];
			}
		}

		System.out.println("가장 큰 값: " + max);
		System.out.println("가장 작은 값: " + min);

	}

}
