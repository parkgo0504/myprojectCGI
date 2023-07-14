package Student;

public class Student {

	private String name, number;
	private int age, scoreJava, scoreWeb, scoreAndroid;

	public Student(String name, String number, int age, int scoreJava, int scoreWeb, int scoreAndroid) {
		super();
		this.name = name;
		this.number = number;
		this.age = age;
		this.scoreJava = scoreJava;
		this.scoreWeb = scoreWeb;
		this.scoreAndroid = scoreAndroid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getScoreJava() {
		return scoreJava;
	}

	public void setScoreJava(int scoreJava) {
		this.scoreJava = scoreJava;
	}

	public int getScoreWeb() {
		return scoreWeb;
	}

	public void setScoreWeb(int scoreWeb) {
		this.scoreWeb = scoreWeb;
	}

	public int getScoreAndroid() {
		return scoreAndroid;
	}

	public void setScoreAndroid(int scoreAndroid) {
		this.scoreAndroid = scoreAndroid;
	}

}
