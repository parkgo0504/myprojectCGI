import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class p5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫자리 0을 제외한 숫자를 입력해주세요. >>");
		int[] nums = { 6, 2, 5, 5, 4, 5, 6, 3, 7, 6 };

		int num = sc.nextInt();
		int result = 0;
		
		while(num >0) {
			
			int num2 = num % 10;
			num /=10;
			result += nums[num2];
		}
		
		System.out.println(result);

	}
}
