import java.util.Scanner;

public class p1 {

	public static void main(String[] args) {
		
		System.out.println("f");
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		
		int hourp =5000;
		
		double over = 0;
		
		int result = hourp*8;
		
		
		
		if(n >8) {
			over =  (hourp * 1.5) *(n-8) ;
		}
		System.out.println(result + (int)over);
		
		
	}
}
