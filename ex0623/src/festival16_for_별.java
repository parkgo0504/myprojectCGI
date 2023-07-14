import java.util.Scanner;
import java.util.Random;

public class festival16_for_별 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력 : ");
		int n = sc.nextInt();
		
		

		int sum =1;
		
		while(n>0) {
			sum *= n; //1*5= 5*4*3*2*1
			n--;
			
		}
		
		
		System.out.println(sum);
	}
	
}
