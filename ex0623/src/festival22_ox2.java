import java.util.Arrays;
import java.util.Scanner;

public class festival22_ox2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==== 채점하기 ====");

		String sheet = "oooxoo";
		
		int score = 0;
		int cnt = 1;
		
		for(int i = 0; i < sheet.length();i++) {
			//System.out.println(i); 값 : 6
			switch(sheet.charAt(i)){
			
			case 'o' : score += (cnt++);
						break;
			case 'x' : 	score += 0;
						cnt = 1;
						break;
			}
			
		}
		System.out.println(score);
	}
}
