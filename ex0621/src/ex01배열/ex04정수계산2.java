package ex01배열;

import java.util.Arrays;

import java.util.Scanner;

public class ex04정수계산2 {

	public static void main(String[] args) {

		int[] array = new int[5];

		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.print((i + 1) + "번째 입력 >> ");
			array[i] = sc.nextInt();

			sum += array[i];

		}
		double avg = (double)sum/array.length;
		Arrays.sort(array);
		
		System.out.println(Arrays.toString(array));
		System.out.println("최고 점수 : " + array[4]);
		System.out.println("최저 점수 : " + array[0]);
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + avg);

	}
}