package ex01배열;

import java.util.Arrays;
import java.util.Random;

public class ex03배열 {

	
	public static void main(String[] args) {
		
		int[] arr = new int[5]; //배열 선언 크기 5
		
		Random ran = new Random(); //랜덤 함수 선언
		int temp=0; //최대 값을 찾기 위해 최소 값을 지정
		for(int i=0; i<arr.length;i++) { // arr의 저장공간 만큼 반복
			arr[i] = ran.nextInt(10)+1; // 입력을 저장만큼 받기
			if(temp < arr[i]) { // 최대 
				temp = arr[i]; 
			}
		}
		System.out.println("배열 안에 들어있는 값 : "+Arrays.toString(arr));
		System.out.println("가장 큰 값은 "+temp+"입니다.");
	}
}
