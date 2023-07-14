package 객체배열;

import pokemon.pke;

public class Main {

	public static void main(String[] args) {
		
		
		pke[] bag = new pke[3];  
		
		System.out.println(bag[0]);
		
		bag[0] = new pke("피카츄", "전기", "백만볼트", 500, 5000);
		System.out.println(bag[0].getAtk());
		System.out.println(bag[0].getSkill());
		
	}
}
