package Lecture21;

public class RemoveConsHead {

	public static void main(String[] args) {
		int n = 3;
		toss(n, "");
	}

	private static void toss(int n, String ans) {
		if (n == 0) {
			System.out.println(ans);
			return;
		}

		if(ans.length()==0 || ans.charAt(ans.length()-1)!='H')
		toss(n - 1, ans + "H");
		
//		if(ans.length()==0 || ans.charAt(ans.length()-1)!='H')
		toss(n - 1, ans + "T");
	}

}
