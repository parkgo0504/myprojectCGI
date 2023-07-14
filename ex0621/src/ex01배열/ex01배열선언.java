package ex01배열;

import java.util.Random;

public class ex01배열선언 {

	public static void main(String[] args) {
		
		//배열은 같은 타입의 여러 변수를 하나의 묶음으로 다루는 자료구조

		//배열의 선언방법
		//자료형[] 변수명 = new 자료형[배열의 크기];
		
		int[] array = new int[10];
		// int array[] = new int[10]; 동일한 의미
		// array --> 10칸 짜리 배열이 어디 있는지 주소값을 참조하는 레퍼런스 변수

		
		//10칸짜리 배열에는 각각 데이터를 저장하는 공간을 가리키는 방번호가 존재
		
		// 배열의 실제 데이터에 접근하는 방법
		// : 레퍼런스 변수명[index번호]
		
		
		System.out.println(array[0]);
		
		// array라는 배열안에 들어가는 데이터를
		// 1~ 10까지의 랜덤한 값으로 모두 변경
		
		Random ran = new Random();
		
				
		for(int i =0; i<array.length; i++) {
			int random = ran.nextInt(10);
			array[i] = random;
		}
		
		for(int i =0; i<array.length; i++) {
			System.out.print(array[i]+ " ");
			
		}
		
		

		
		
		
		
	}
}
