package core.less3;

public class Main {

	public static void main(String[] args) {
		Hunter hunter = new Hunter(23, "Endy");
		hunter.eatMeat("fine meat");
		hunter.eatMeat();
		hunter.eatMeat();
		Human human = new Human(20, "Petey");
		System.out.println(human);
		System.out.println(hunter);
		
		ValueObject vo = new ValueObject(23, "Red");
		System.out.println(vo);
		int size = vo.size;
		int age = hunter.getAge();
		vo = vo.changeSize(33);
		System.out.println(vo);
		Human.countOfPeople();
	}

}
