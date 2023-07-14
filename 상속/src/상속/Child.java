package 상속;

public class Child extends Parent {

	//자식 , 서브 클래스
	public void makeBong() {
		System.out.println("파스타");
	}
	
	public void makeStreak() {
		System.out.println("스테이크(+)");
	}

	@Override
	public void makeAlio() {
		System.out.println("오잉");
	}
	
	public void Child() {
		
		System.out.println("black sheep wall");
		
	}
	
	
}
