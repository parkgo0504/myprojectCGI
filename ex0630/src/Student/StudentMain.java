package Student;

public class StudentMain {
	public static void main(String[] args) {


		Student stu1 = new Student(null, null, 0, 0, 0, 0);

//		s.setName("박기원");
//		String name =s.getName();
//		
//		System.out.println(name);

//		stu1.setNumber("20174163");
//		stu1.setAge(21);
//		stu1.setScoreJava(50);
//		stu1.setScoreWeb(99);
//		stu1.setScoreAndroid(77);

		String num = stu1.getNumber();
		int age = stu1.getAge();
		int sj = stu1.getScoreJava();
		int sw = stu1.getScoreWeb();
		int sa = stu1.getScoreAndroid();

		System.out.println(num);
		System.out.println(age);
		System.out.println(sj);
		System.out.println(sw);
		System.out.println(sa);

	}
}
