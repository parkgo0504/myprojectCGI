package for문;

public class ex10_이중for문 {
	public static void main(String[] args) {

		for(int i=5; i>0; i--) { //5,4,3,2,1
			for(int j=1; j<6; j++) { //0,1,2,3,4
				
				if(i>j) { //
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
				
				
			}
			System.out.println();
		}
		
	}

}
