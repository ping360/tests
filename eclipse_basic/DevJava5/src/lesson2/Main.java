package lesson2;

public class Main {

	public static void main(String[] args) {
		int i = 0;
		switch (i) {
		case 0:
			System.out.println("Zero");
			break;
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		default:
			System.out.println("Default");
		}
		// цикл з передумовою
		while (i < 10) {
			System.out.println(i++);
			hello();
		}
		// цикл з п≥сл€умовою
		do {
			System.out.println(++i);
		} while (i < 10);

		for (int j = 0; j < 10; j++) {
			System.out.println(j);
		}
		// Ctrl + 2
		double add = add(1.5, 3.5);
		System.out.println(add);
		double sub = sub(2, 5);

		double mult = mult(3, 4);
		System.out.println(mult);
		double div = div(45, 5);
		
		//або або calculate(a,b,'*');
		calculate(2,3,'*');
		double calculate = calculate(2,3,'*');
		System.out.println(calculate(256,56,'*'));
		
		hello(); 
		// виклик функц≥њ чи ≥нших метод≥в проводитьс€ через основний метод Main.
		int increment = increment(1);
		System.out.println(increment);
	}

	// функц≥€/метод
	static void hello() {
		System.out.println("Hello");
	}

	static int increment(int i) {
		return i++;
	}

	static double add(double a, double b) {
		return a + b;
	}

	static double sub(double a, double b) {
		return a - b;
	}

	static double mult(double a, double b) {
		return a * b;
	}

	static double div(double a, double b) {
		return a / b;
	}

	static double calculate(double a, double b, char operator) {
		switch (operator) {
		case '+':
			return add(a, b);
		case '-':
			return sub(a, b);
		case '*':
			return mult(a, b);
		case '/':
			return div(a, b);
		default:
			calculate(a, b, operator);
			return 0;
		}
	}
}
