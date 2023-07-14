package javaFestival_20;

import java.util.Scanner;

public class java17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		int number;
		for (int i = 0; i < 10; i++) {
			System.out.print((i + 1) + "번째 정수 입력");
			number = sc.nextInt();

			if (i % 3 == 0) {
				a[i] = number;
			}

		}
		System.out.print("3의 배수 : ");
		for(int i=0; i<a.length; i++) {
			if(a[i] > 0) {
				System.out.print(a[i]+ " ");
			}
			
		}
		

	}
}
