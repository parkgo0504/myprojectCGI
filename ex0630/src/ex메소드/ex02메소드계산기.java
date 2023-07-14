package ex메소드;

public class ex02메소드계산기 {

	public static void main(String[] args) {
		
		int a=add(3,5);
		int s =sub(3,5);
		int m =mul(3,5);
		int d = div(3,5);
		
		System.out.println(a);
		System.out.println(s);
		System.out.println(m);
		System.out.println(d);
		
		
		
	}
	
	public static int add(int a, int b) {
		
		int result = a+b;
		return result;
		
	}
	public static int sub(int a, int b) {
		
		int result = a-b;
		return result;
		
	}
	public static int mul(int a, int b) {
		
		int result = a*b;
		return result;
		
	}
	public static int div(int a, int b) {
		
		int result = a/b;
		return result;
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
