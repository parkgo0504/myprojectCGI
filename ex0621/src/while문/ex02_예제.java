package while문;

import java.util.Scanner;

public class ex02_예제 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("종료를 위해 -1을 입력하세요.");

        int n = 0;
        int s = 0;
        while (true) {
            System.out.print("정수를 입력하세요: "); //입력 -1누르기 전 반복
            n = sc.nextInt();
            if (n == -1) { // -1 입력되면 break
                break;
            }
            s += n; //누적
            System.out.println("누적 결과: " + s);
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
