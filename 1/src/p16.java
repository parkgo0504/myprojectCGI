import java.util.Scanner;

public class p16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		int sum = 0;

		char[] c = str.toCharArray();
		int j = 0;
		for (int i = 0; i < c.length; i++) {

			switch (c[i]) {
			case '0':

				j++;
				break;
			case '1':
				j++;
				sum += Math.pow(2, j);
				break;

			}

		}
		System.out.println(str + " : " + sum);
	}
}
