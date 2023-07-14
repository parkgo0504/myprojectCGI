package ex메소드;

class Super {
	Super() {
		System.out.print('A');
	}

	Super(char x) {
		System.out.print(x);
	}
}

class Sub extends Super {
	Sub() {
		//super();
		System.out.print('B');
	}

	Sub(char x) {
		this();
		System.out.print(x);
	}
}

public class java연습4 {

	public static void main(String args[]) {
		Super s1 = new Super('C');
		Sub s2 = new Sub('D');
	}
}
