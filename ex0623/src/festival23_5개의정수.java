import java.util.Scanner;
import java.util.Arrays;

public class festival23_5개의정수 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] array = new int[5];
		
		int sum =0;
		for(int i=0; i<array.length; i++) {
			System.out.println((i+1)+ "번째 수 입력 : ");
			array[i] = sc.nextInt();
			
		}
		Arrays.sort(array);
		
		for(int i=0; i<array.length; i++) {
		System.out.print(array[i]+ " ");
		}
		
		
		
	}
}
