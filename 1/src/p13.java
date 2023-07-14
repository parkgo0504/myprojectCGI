import java.util.Scanner;

public class p13 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("정수 입력 :");
		int sum =0;
		int n = sc.nextInt();
		
		while(n>0) {
			sum +=n %10;
			n /=10;
			
		}
		System.out.println("합은 "+sum+"입니다.");
		
		
	}
}
