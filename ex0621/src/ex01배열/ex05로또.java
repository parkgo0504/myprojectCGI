package ex01배열;

import java.util.Random;

public class ex05로또 {

	public static void main(String[] args) {

		int array[] = new int[5];
		Random ran = new Random();

		
		for (int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(5) + 1; // 0~4 배열 추가
			for (int j = 0; j < i; j++) { //j가 i 보다 작으면 반복문 안됨

				if (array[i] == array[j]) { // 서로 같으면
					array[i] = ran.nextInt(5) + 1; // 새로운 랜덤 숫자 입력
					i--; // 다시 돌아가기 위한 마이너스
					break;
				}
			}
		}
		for (int i = 0; i < array.length; i++) { // 따로 출력
			System.out.print(array[i] + " ");
		}
	}

}
