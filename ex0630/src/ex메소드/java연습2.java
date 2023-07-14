package ex메소드;

class A {
	A() { System.out.printf("%d ", 10); } // 디폴트 생성자
	A(int a){
		{ System.out.printf("%d ", a); }
	}
    // (3) A의 생성자 호출, 및 10 출력
}

class B extends A {
	B(int a) { System.out.printf("%d ", a); } // C class에서 인자가 있는 생성자를 명시적으로 호출하기 때문에 B() 디폴트생성자 생략이 가능하다.
	// (4) B의 생성자엔 100을 인자로 받은 100 출력
}

class C extends B {

	C(int a) { // (2) 1000인자값을 받아온다. 그리고 생성자는 무조건 최상위 클래스를 호출한다. 
		super(a/100);
        System.out.printf("%d", a); // (5) 1000출력
	}
}
public class java연습2 {

	public static void main(String args[]) {
		B b = new B(1000); // (1) A의 인자를 받은 C생성자 b를 생성한다.
	}

}
