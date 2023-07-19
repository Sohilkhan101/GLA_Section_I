package Lecture21;

public class CoinToss {

	public static void main(String[] args) {
		int n = 3;
		toss(n, "");
	}

	private static void toss(int n, String ans) {
		if (n == 0) {
			System.out.println(ans);
			return;
		}
		
		toss(n - 1, ans + "H");
		toss(n - 1, ans + "T");
	}

}
