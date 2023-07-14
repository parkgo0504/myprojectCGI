import java.util.Scanner;

public class festival5 {
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.print("현재몸무게 : ");
		int t = sc.nextInt();

		System.out.print("목표몸무게 : ");
		int g = sc.nextInt();
		
		do {
			int i=1;
			System.out.println(i+"주차 감량 몸무게 : ");
			i++;
			int f = sc.nextInt();
			
			t -=f;
			
			
		}while(t>g);

		System.out.println(g+"kg 달성");
		
	}
}
