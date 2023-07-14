import java.util.Scanner;

public class festival2 {
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("총금액 입력 : ");
		int i = sc.nextInt();
		int a,b,c,d,e;
		
		a= i /10000;
		b= (i %10000)/5000;
		c= (i %10000%5000)/1000;
		d= (i %10000%5000%1000)/500;
		e= (i %10000%5000%1000%500)/100;
		
		
		System.out.println("10000원 : "+a);
		System.out.println("5000원 : "+b);
		System.out.println("1000원 : "+c);
		System.out.println("500원 : "+d);
		System.out.println("100원 : "+e);

		
		
		
		
	}
}
