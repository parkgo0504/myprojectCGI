import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class festival19_로또 {
	public static void main(String[] args) {

		Random ran = new Random();

		int array[] = new int[6];

		for (int i = 0; i < array.length; i++) {
			array[i] = ran.nextInt(60) + 1;
			for (int j = 0; j < i; j++) {
				if (array[i] == array[j]) {
					array[i] = ran.nextInt(60) + 1;
					i--;
				}
			}
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println("행운의 숫자 : " + array[i]);
		}

	}

}
