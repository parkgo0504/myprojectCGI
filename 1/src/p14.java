import java.util.ArrayList;
import java.util.Scanner;

public class p14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("n 입력 : ");
		String s = sc.next();
		int sum = 1;
		int d = 1;
		char[] sarray = s.toCharArray();

		for (int i = 0; i < sarray.length; i++) {

			switch (sarray[i]) {

			case 'o':

				sum += d;
				d++;

				break;

			case 'x':
				d = 0;
				break;

			}
		}
		System.out.println(sum + 1);

	}
}
