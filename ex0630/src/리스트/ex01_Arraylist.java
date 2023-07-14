package 리스트;

import java.util.ArrayList;

public class ex01_Arraylist {

	public static void main(String[] args) {
		

		
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("유부초밥");
		
		list.add("두부카레");
		
		list.add("치킨마요");
		
		System.out.println(list.get(2));
		
		list.remove(1);
		System.out.println(list.get(1));
		
		
		list.add(1, "고기");
		System.out.println(list.get(1));
		
		list.clear();
		System.out.println(list.size());
	}
}
