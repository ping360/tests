package core.less3;

public class Hunter extends Human {

	private int killedMammonts;

	Hunter(int age, String name) {
		super(age, name);
		System.out.println("4");
	}

	public void eatMeat(String meat) {
		System.out.println(getName() + ": i eat this shit " + meat);
	}

	public void eatMeat() {
		run();
		killedMammonts++;
		System.out.println(getName() + ": I kill " + killedMammonts
				+ " mammonts");
		eatMeat("mammont meat");
	}

	@Override
	public void run() {
		System.out.println(getName() + ": faster go-go-go");
	}

	public String toString() {
		return "Human [age=" + getAge() + ", name=" + getName()
				+ ", killedMammonts=" + killedMammonts + "]";
	}
}
