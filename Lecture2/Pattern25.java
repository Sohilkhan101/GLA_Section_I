package Lecture2;

public class Pattern25 {
	public static void main(String[] args) {
		int n = 5;
		int nst = 1;

		int row = 0;
		int nsp = n - 1;
		
		while (row < n) {
			int val=row+1;
			for (int i = 0; i < nsp; i++) {
				System.out.print(" "+"\t");
			}

			for (int i = 0; i < nst; i++) {
				System.out.print(val+"\t");
				if(i<nst/2)
				val++;
				else val--;
			}

			nst += 2;
			nsp--;
			row++;
			System.out.println();
		}
	}

}
