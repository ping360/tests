package lesson1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello Motherfucker!");
		int i = 1;
		double dob = 2.5;
		float fl = 256;
		boolean bool = false;
		byte bt = 32;
		char ch = 12;
		long l = 124589;
		
		if (i>0) {
			System.out.println("True");
		}
		else if (bool) {
			System.out.println("False");
		}
		else {
			System.out.println("Second else");
		}
		double a = 2;
		double b = 6;
		double c = 4;
		double D = (b*b - 4*a*c);
		if (D<0){
			System.out.println("Розвязки немає");
		}
		else if (D>0) {
			double x1 = (-b-Math.sqrt(D))/(2*a);
			double x2 = (-b+Math.sqrt(D))/(2*a);
			System.out.println("x1 = "+x1);
			System.out.println("x2 = "+x2);
		}else{
			double x = -b/(2*a);
			System.out.println("x = "+x);
		}
		//Ctrl+Shift+O імпорт недостающих класів.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int res = sc.nextInt();
		System.out.println(res);
	}
}
