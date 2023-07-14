package javaFestival_20;

import java.util.Scanner;

public class java16_문자열받고배열 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수 입력");

		String s = sc.next();
		int sum = 0;

		String data[] = s.split("");
		for (int i = 0; i < data.length; i++) {

			switch (data[i]) {

			case "1":
				sum += 1;
				break;
			case "2":
				sum += 2;
				break;
			case "3":
				sum += 3;
				break;
			case "4":
				sum += 4;
				break;
			case "5":
				sum += 5;
				break;
			case "6":
				sum += 6;
				break;
			case "7":
				sum += 7;
				break;
			case "8":
				sum += 8;
				break;
			case "9":
				sum += 9;
				break;
			default:
				System.out.println("다시");
				continue;
			}

		}
		System.out.println("합은 " + sum + "입니다.");
	}
	


//    Scanner sc = new Scanner(System.in);
//    System.out.println("정수 입력");
//
//    String s = sc.next();
//    int sum = 0;
//
//    for (int i = 0; i < s.length(); i++) {
//        char c = s.charAt(i);
//        if (Character.isDigit(c)) {
//            sum += Character.getNumericValue(c);
//        } else {
//            System.out.println("다시");
//        }
//    }
//    System.out.println("합은 " + sum + "입니다.");


}
