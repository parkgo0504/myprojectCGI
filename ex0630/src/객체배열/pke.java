package 객체배열;

public class pke {

	private String name, type, skill;
	private int atk, hp;

	public pke(String name, String type, String skill, int atk, int hp) {
		super();
		this.name = name;
		this.type = type;
		this.skill = skill;
		this.atk = atk;
		this.hp = hp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSkill() {

		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public int getAtk() {

		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getHp() {

		if (hp > 0) {
			return hp;
		} else {
			this.die();
			return hp=0;
		}
	}

	private void die() {
		System.out.println("죽었습니다.");
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

}
