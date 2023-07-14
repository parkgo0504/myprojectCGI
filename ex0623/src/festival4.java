import java.util.Scanner;

public class festival4 {
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 숫자 입력 : ");
		int a = sc.nextInt();
		System.out.println("두번째 숫자 입력 : ");
		int b = sc.nextInt();

//		int sum =0;
//		int f = b% 10; // 5
//		b /=10;	
//		int q = f*a; //첫번째
//		System.out.println(q);
//		
//		int g = b% 10;
//		b/=10;
//		int w = g*a; //두번째
//		System.out.println(w);
//		
//		int h = b% 10;
//		b/=10;
//		int e= h*a;
//		System.out.println(e);
//		
//		sum =q+(w*10)+(e*100);
//		System.out.println(sum);
		
		System.out.println(a*(b%10));
	    System.out.println(a*((b%100)/10));
	    System.out.println(a*(b/100));
	    System.out.println(a*b);
	}
}
