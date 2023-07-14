package ex메소드;

class Ref {
	int a;

	Ref(int x) {
		a = x;
	}

	int sum(Ref obj) {
		int k;
		k = obj.a - a;
		a = 20;
		obj.a = 30;
		return k;
	}
}

public class java연습 {

	public static void main(String[] args) {
		Ref obj1 = new Ref(3);
		Ref obj2 = new Ref(4);
		int k1 = obj2.sum(obj1);
		System.out.print("  k1=  " + k1);
		System.out.print("  obj1.a=  " + obj1.a);
		System.out.print("  obj2.a=  " + obj2.a);

	}
}
