package ex01배열;

import java.util.Arrays;
import java.util.Scanner;

public class ex04정수계산 {

	public static void main(String[] args) {

		int[] array = new int[5];

		Scanner sc = new Scanner(System.in);

		int max = 0;
		int min = 9999;
		int sum = 0;
		
		
		for (int i = 0; i < array.length; i++) {
			System.out.print((i + 1) + "번째 입력 >> ");
			array[i] = sc.nextInt();
			if (max < array[i]) {
				max = array[i];
			}

			if (min > array[i]) {
				min = array[i];
			}
			sum += array[i];

		}
		
		double avg = (double)sum/array.length;
		System.out.println(Arrays.toString(array));
		
		
		System.out.println("최고 점수 : " + max);
		System.out.println("최저 점수 : " + min);
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + avg);

	}
}