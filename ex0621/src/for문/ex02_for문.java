package for문;

public class ex02_for문 {
	public static void main(String[] args) {
//		for (int i = 96; i > 72; i--) {
//			System.out.print(i + " ");
//
//		}
//		System.out.println();
//
//		for (int i = 96; i > 72; i--) {
//			if (i % 2 == 1) {
//				System.out.print(i + " ");
//			}
//		}
		
		
		
		int num[] = new int[24];
		
		for (int i = 0,j =96 ;j > 72; i++, j--) {
			num[i] = j;
		}
		
		
		for(int n : num ) {
			System.out.print(n + " ");
		}
		
		System.out.println();
		
		for(int n : num) {
			if(n%2 ==1) {
				System.out.print(n + " ");
			}
		}
	}
}
