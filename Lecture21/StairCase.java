package Lecture21;

public class StairCase {
	public static void main(String[] args) {
		int n = 4;
		print(n, "");
	}

	private static void print(int n, String ans) {

		if (n == 0) {
			System.out.println(ans);
			return;
		}
		if (n < 0) {
			return;
		}

		print(n - 1, ans + 1);
		print(n - 2, ans + 2);
		print(n - 3, ans + 3);
	}

}
