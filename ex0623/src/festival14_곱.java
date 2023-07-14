import java.util.Scanner;
import java.util.Random;

public class festival14_곱 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		int n = sc.nextInt();
		
		
//		int a,b,c,d,e,f,g,h;
		
//		a =n/ 10000000;
//		b =n% 10000000/1000000;
//		c =n% 10000000%1000000/100000;
//		d =n%10000000%1000000%100000/10000;
//		e =n%10000000%1000000%100000%10000/1000;
//		f =n%10000000%1000000%100000%10000%1000/100;
//		g =n%10000000%1000000%100000%10000%1000%100/10;
//		h =n%10000000%1000000%100000%10000%1000%100%10;
//		
//		int sum = a+b+c+d+e+f+g+h;
		
		int sum =0;
		
		while(n>0) {
			sum += n%10; //10 나머지
			n /=10;
			
		}
		
		
		System.out.println(sum);
	}
	
}
