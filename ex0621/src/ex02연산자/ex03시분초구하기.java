package ex02연산자;

import java.util.Scanner;

public class ex03시분초구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//1분 60초 1시간 3600초
		Scanner sc = new Scanner(System.in);
		
		System.out.print("초 입력 : ");
		int totalSecond = sc.nextInt();
		
		/*int h =  totalSecond / 3600;
		totalSecond -=  (h*3600);
		int m = totalSecond / 60;
		totalSecond -=  (m*60);
		int s = totalSecond;
		*/
		int h = totalSecond/3600;
		int m =totalSecond/60%60;
		int s =totalSecond%60;
		System.out.println(h+"시"+m+"분"+s+"초");
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
