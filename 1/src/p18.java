import java.util.Arrays;
import java.util.Scanner;

public class p18 {

	public static void main(String[] args) {

		int base = 3;
		int n = 3;
		int result = powerN(base, n);
		System.out.println("결과 :" + result);

	}



	public static int powerN(int base, int c) {

		return (int) Math.pow(base, c);

	}

}
