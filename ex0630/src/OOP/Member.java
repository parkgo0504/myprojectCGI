package OOP;

public class Member {
	// 1.필드(field, 속성, data)
	// 이름
	String name;
//	전화번호
	String phone;
//	알림
	boolean notification;
//	이메일
	String email;
//	나이
	int age;

	public static void main(String[] args) {

	}

//	2.메소드(Method, logic, 행위
//	다른 파일에서 해당하는 메소드를 사용할 거기 때문에, 접근제한자 public으로 둔다
//	static 키워드를 사용하지 말자
//	메시지 보내기
	public void sendMessage() {
		System.out.println("메시지 보내기");

	}
//	송금하기

	public void sendMoney(int money) {
		System.out.println(money + "원을 송금합니다.");
	}
}
