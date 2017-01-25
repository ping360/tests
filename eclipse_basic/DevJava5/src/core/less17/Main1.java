package core.less17;

public class Main1 {

	public static void main(String[] args) {
		// for (int i = 1; i <= 10; i++) {
		// System.out.println(i);
		// }
		// System.out.println();

		print(new Filter() {
			
			@Override
			public boolean test(int i) {
				return true;
			}
		});
		print(new Filter() {
			
			@Override
			public boolean test(int i) {
				return i%2==0;
			}
		});
		print(new Filter() {
			
			@Override
			public boolean test(int i) {
				return i%3==0;
			}
		});
	}

	static void print(Filter filter) {
		for (int i = 1; i <= 10; i++) {
			if (filter.test(i))
			System.out.println(i);
		}
		System.out.println();
	}

//	static void print1() {
//		for (int i = 1; i <= 10; i++) {
//			if (i % 2 == 0)
//				System.out.println(i);
//		}
//		System.out.println();
//	}
//
//	static void print2() {
//		for (int i = 1; i <= 10; i++) {
//			if (i % 3 == 0)
//				System.out.println(i);
//		}
//		System.out.println();
//	}
}
