import java.util.ArrayList;
import java.util.Scanner;

public class p4 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int[] nums = new int[10];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();            
        }

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] < x){
                System.out.print(nums[i] + " ");
            }
        }}

}
