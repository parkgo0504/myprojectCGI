
public class ex21_비교 {
	public static void main(String[] args) {
		int[] point = { 92, 32, 52, 9, 81, 2, 68 }; 

		int result = point[0] - point[1]; // 처음 min값

		int f = 0; // 인덱스 첫번째 저장값
		int l = 0; // 인덱스 두번째 저장값

		for (int i = 0; i < point.length; i++) { 
			for (int j = 0; j < point.length; j++) {

				if (i != j) { // i == j 를 탐색하지 않도록
					if (point[i] - point[j] > 0) { // 음수는 조건에서 빼
						if (point[i] - point[j] < result) { // 두 수의 차가 min보다 작을때
							result = point[i] - point[j]; // min이 비교 값이 됨

							f = i; //첫번째 인덱스 저장
							l = j; //두번째 인덱스 저장
						}
					}
				}
			}
		}
		System.out.print(f + "," + l); // 출력
		


	}
}
