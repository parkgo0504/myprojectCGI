import java.util.Scanner;
import java.util.Random;

public class festival15_팩토리얼 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("행 개수 : ");
		int r = sc.nextInt();
		
		
		
		for(int i = 1;i<r+1;i++ ) {
			for(int j =0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		
	}
}
