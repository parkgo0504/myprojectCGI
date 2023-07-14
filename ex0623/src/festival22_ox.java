import java.util.Scanner;

public class festival22_ox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array = new String[6];
        System.out.println("채점하기");
        int sum = 0;
        int total = 0; // 초기값을 0으로 설정

        for (int i = 0; i < array.length; i++) {
            array[i] = sc.next(); // 사용자로부터 입력 받은 값으로 배열 초기화

            if (array[i].equals("o")) {
                sum += 1;
                total += sum;
            } else {
                sum = 0;
            }
        }
        System.out.println(total);
    }
}
