import java.util.Scanner;

public class p12 {

	public static void main(String[] args) {

		String score = "A,A,B,C,D,A,C,D,D,D,F";

		int[] arr = new int[26];
		score = score.replace(",", "");

		char[] c = score.toCharArray();

		for (int i = 0; i < c.length; i++) {

			arr[c[i] - 65]++;
		}

		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i]>0) {
				
				System.out.print((char)(i - 65) + " : " + arr[i]);
			}


		}

	}
}
