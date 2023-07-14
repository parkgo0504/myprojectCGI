package javaFestival_20;

public class java13_문자열갯수 {
	public static void main(String[] args) {

		String score = "A,A,B,C,D,A,C,D,D,D,F";

		int countA = 0, countB = 0, countC = 0, countD = 0, countF = 0;
//		split() : 지정한 문자를 기준으로 문자열을 잘라 배열로 반환한다.
		String data[] = score.split(",");

//		배열 ['A','A'..]
		for (int i = 0; i < data.length; i++) {
			if (data[i].equals("A")) {
				countA++;
			} else if (data[i].equals("B")) {
				countB++;
			} else if (data[i].equals("C")) {
				countC++;
			} else if (data[i].equals("D")) {
				countD++;
			} else
				countF++;
		}
		System.out.println("A : "+countA+"명");
		System.out.println("B : "+countB+"명");
		System.out.println("C : "+countC+"명");
		System.out.println("D : "+countD+"명");
		System.out.println("F : "+countF+"명");

	}

}
