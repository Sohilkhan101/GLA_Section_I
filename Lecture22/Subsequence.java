package Lecture22;

public class Subsequence {

	public static void main(String[] args) {
		String s = "abc";
		subseq(s, "");
	}

	private static void subseq(String s, String ans) {
		// TODO Auto-generated method stub
		if (s.length() == 0) {
			System.out.println(ans);
			return;
		}

		subseq(s.substring(1), ans + s.charAt(0));
		subseq(s.substring(1), ans);

	}

}
