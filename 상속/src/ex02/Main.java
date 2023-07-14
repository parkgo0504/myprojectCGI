package ex02;

public class Main {
	public static void main(String[] args) {

		Mario ma = new Mario();
		Game an = new Animal();
		Game ze = new Zelda();

		play(ma);
		play(an);
		play(ze);

	}

	// 게임 실행
	private static void play(Game game) {
		game.start();
	}
	

}
