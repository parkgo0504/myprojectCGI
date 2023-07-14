package javaFestival_20;

import java.util.Scanner;

public class a {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("정수 입력");

        String s = sc.next();
        int sum = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                sum += Character.getNumericValue(c);
            } else {
                System.out.println("다시");
            }
        }
        System.out.println("합은 " + sum + "입니다.");
    }
}
