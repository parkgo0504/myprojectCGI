package ex메소드;

class Car{
	
	
	
    // 매개변수
	String model;
	String color;
	int yyyy;

	Car() {
        this.model = "승용차";
        this.color="검정";
        this.yyyy=2023;
        System.out.println("model : " + model);
	}

	Car(String model, String color, int yyyy){
		this.model = model;
		this.color = color;
		this.yyyy = yyyy;
		System.out.println("model : " + model);
    }
	
}
public class java연습3 {

	public static void main(String args[]) {
		A b = new C(1000); // (1) A의 인자를 받은 C생성자 b를 생성한다.
	}

}
