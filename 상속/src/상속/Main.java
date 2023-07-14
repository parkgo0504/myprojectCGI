package 상속;

public class Main {
	public static void main(String[] args) {
		
		Child c = new Child();
		c.makeAlio(); //오버라이딩 한 경우 자식 이 호출
		
	
		Parent p = new Child();
		
		p.makeAlio();
		p.makeStreak();
		
		
		
		Child abc = (Child)p;
		
		c.makeBong(); 
		
		
		
		
	}

}
