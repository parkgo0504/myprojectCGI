package 리스트;

import java.util.ArrayList;

import pokemon.pke;

public class ex2 {

	public static void main(String[] args) {

		ArrayList<pke> pk = new ArrayList<pke>();

		pke pa = new pke("뮤츠", "정신", "스킬1", 500, 5000);
		
		pk.add(pa);
		System.out.println(pk.get(0).getAtk());
		System.out.println(pk.get(0).getSkill());

	}
}
