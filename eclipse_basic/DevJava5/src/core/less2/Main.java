package core.less2;

public class Main {

	public static void main(String[] args) {
		Person p = new Person(18, "Ivan");
		System.out.println(p);
		// p.age = 18;
		// p.name= " Ivan";
		System.out.println(p.age);
		System.out.println(p.name);
		Person p1 = new Person(25, "Vasiliy");
		System.out.println(p1);
		// p1.age = 25;
		// p1.name= " Vasiliy";
		System.out.println(p1.age);
		System.out.println(p1.name);
		p.run();
	}
	
	
}

