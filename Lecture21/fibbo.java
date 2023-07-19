package Lecture21;

public class fibbo {

	public static void main(String[] args) {
		int n = 10;
		System.out.println(fibb(n));
	}

	private static int fibb(int n) {
		if (n == 0 || n == 1) {
			return n;
		}
		int a = fibb(n - 1);
		int b = fibb(n - 2);
		return a + b;
	}

}
