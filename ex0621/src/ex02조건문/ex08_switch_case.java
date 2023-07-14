package ex02조건문;

public class ex08_switch_case {

	public static void main(String[] args) {

		switch (3 / 1) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		default:
			System.out.println("기본 동작입니다.");
			break;
		}
		System.out.println("이 부분은 switch 블록을 벗어난 후에 실행됩니다.");

	}
}
