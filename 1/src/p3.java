
public class p3 {

	public static void main(String[] args) {

		

        int[][] num = new int[5][5];
        int count = 1;
        for(int i = 0; i < num.length; i++){
            for (int j = 0; j < num.length; j++) {
                num[i][j] = count++;
            }
        }
        for(int i = 0; i < num.length; i++){
            for (int j = 0; j < num.length; j++) {
                System.out.print(num[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 4; i >= 0; i--){
            for (int j = 0; j < num.length; j++) {
                System.out.print(num[j][i] + "\t");
            }
            System.out.println();
        }

	}
}
