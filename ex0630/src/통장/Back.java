package 통장;

public class Back {

	// 필드 
	// 데이터 접근 x
	
	private int money;

	// 메소드
	public void deposit(int money) {

		this.money += money; // 내가 코드를 작성하고 있는 클레스 자체를 의미
		System.out.println("입금" + money);
	}

	public void withdraw(int money) {
		
		
		if(this.money >money) {
			System.out.println("출금하다 :" + money);
			this.money -= money;
		}else {
			System.out.println("돈이 부족합니다.");
		}

	}

	public int showMoney() {
		return money;
	}
}
