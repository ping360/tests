package lesson3;

public class Main {

	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6,7,8,9}; // tyt index 0-8 (0=1 a 8=9)
		int[] array1 = new int[10];
		int a = array[0];
		array[0] = 7;
		for (int i = 0; i < array1.length; i++) {
			array1[i] = i + 2;
			System.out.print(array1[i]);
		}
	}

}
