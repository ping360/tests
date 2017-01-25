package core.less12;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {

		// System.out.println(0/0);
		// System.out.println("Done");

		try {
			System.out.println(0 / 0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (RuntimeException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("Done");
		try {
			kaput();
		} catch (MyException e) {
			e.printStackTrace();
		} finally {
			
		}
	}

	static void kaput() {
		throw new MyException();
	}

}
