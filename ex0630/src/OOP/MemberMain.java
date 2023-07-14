package OOP;

public class MemberMain {
	public static void main(String[] args) {

//		
//		jvm(java virual machine ) : ctrl f11실행
//		제일먼저 찾아서 실행하는 메소드 main mathod
//		모든 코드들은 main method 안쪽에 작성해야만 가능하다

//		1. Member 설계도면을 기반으로 m1 객체 생성
		Member m1 = new Member();
		Member m2 = new Member();
		System.out.println(m1);

		m1.sendMessage();
		m1.name = "김영웅";
		m1.age = 20;
		m1.phone = "010";

		// 접근제한자
		System.out.println("이름 : " + m1.name);
		// 래퍼런스 변수(객체)의 기본 값은 null이다.
		System.out.println("나이 : " + m1.age);
		System.out.println("폰 : " + m1.phone);
		System.out.println("알림 : " + m1.notification);

		System.out.println();

		m2.name = "박기원";
		m2.age = 20;
		m2.phone = "010-9067-7640";
		m2.notification = true;

		// 접근제한자
		System.out.println("이름 : " + m2.name);
		// 래퍼런스 변수(객체)의 기본 값은 null이다.
		System.out.println("나이 : " + m2.age);
		System.out.println("폰 : " + m2.phone);
		System.out.println("알림 : " + m2.notification);

	}
}
