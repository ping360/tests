package core.less5;

public class Main {

	public static void main(String[] args) {
		
		Cpu cpu = new Cpu(4.4, 16);
		Ram ram = new Ram(1666, 32);
		Hdd hdd = new Hdd(10);
		Computer computer = new Computer("Alienware", cpu, ram, hdd);
		System.out.println(computer);
		computer.getCpu().turboBoost();
		System.out.println(computer);
		computer.getRam().setCapacity(64);
		System.out.println(computer);
		Computer computer2 = new Computer("Dell", 4, 4, 1666, 4, 1);
		System.out.println(computer2);
	}

}
