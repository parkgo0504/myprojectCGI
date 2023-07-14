import java.util.Scanner;
import java.util.Random;

public class festival15_팩토리얼3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("행 개수 : ");
		int r = sc.nextInt();
		
		
		
		for(int i = r;i>0;i-- ) { //1,2,3,4,5
			for(int j =1; j<r+1; j++) {
				if(i>j) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}

		
	}
}
