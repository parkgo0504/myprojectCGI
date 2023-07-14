import java.util.Scanner;
 
public class festival22_ox3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
 
		String arr[] = new String[1];
 
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.next();
		}
		
		in.close();
		
		for (int i = 0; i < arr.length; i++) {
			
			int cnt = 0;	// 연속횟수
			int sum = 0;	// 누적 합산 
			
			for (int j = 0; j < arr[i].length(); j++) {
				
				if (arr[i].charAt(j) == 'o') {
					cnt++;
				} 
				else {
					cnt = 0;
				}
				sum += cnt;
			}
			System.out.println(sum);
		}
	}
}