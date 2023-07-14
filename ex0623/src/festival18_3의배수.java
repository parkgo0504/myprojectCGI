import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class festival18_3의배수 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int array[] = new int[10];

		for (int i = 0; i < 10; i++) {
			System.out.print((i+1) + "번 째 정수 입력 :");
			array[i] = sc.nextInt();

		}
		System.out.print("3의 배수 : ");
		for (int i = 0; i < 10; i++) {
			if (array[i] % 2 == 1) {
				System.out.print(array[i]+" ");

			}
			
		}

	}

}
