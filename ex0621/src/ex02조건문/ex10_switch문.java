package ex02조건문;

import java.util.Scanner;

public class ex10_switch문 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("월을 입력하세요: ");
        int t = sc.nextInt();
        String season;

        switch (t) {
            case 12, 1, 2 -> season = "겨울";
            case 3, 4, 5 -> season = "봄";
            case 6, 7, 8 -> season = "여름";
            case 9, 10, 11 -> season = "가을";
            default -> {
                System.out.println("1월부터 12월 사이의 값을 입력하세요.");
                return;
            }
        }

        System.out.println(t + "월은 " + season + "입니다.");
    }
}