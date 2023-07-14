package ex01배열;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;
public class ex02홀수찾기 {

	public static void main(String[] args) {
		
		int[] array = new int[5];
		int stack=0;

		Random ran = new Random();
		
		
		System.out.print("array에 들어있는 홀수는 ");
		for(int i=0; i<array.length; i++) {
			array[i]= ran.nextInt(9)+1;
			
			if(array[i]% 2 ==1) {
				System.out.print(array[i]+ " ");
				stack++;
			}
		}
		System.out.print("이며, 총"+stack+"개 입니다,");

		
		
		
		
		
	}
}
