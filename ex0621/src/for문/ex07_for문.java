package for문;

public class ex07_for문 {

	public static void main(String[] args) {
		
		int a=0;
		int b = 77;
		
		for(int i=1; i<78; i++) {
			System.out.print("("+b+"*"+i+") + ");
			a +=b*i;
			b--;
		}
		System.out.println(a);
	}
}
