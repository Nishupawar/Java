//package PatternPdf;

public class Pattern73 {
	public static void main(String[] args) {
		int end = 1;
		int mid = 1;
		for (int i = 1; i <= 5; i++) {
			int cnt = 0;
			for (int j = 1; j <= end; j++) {
				if (j < mid){
					System.out.print((char)(cnt+65));
					cnt++;      //A
				}               //ABA
				else {
                 System.out.print((char)(cnt+65));
					cnt--;
				}
			}
			System.out.println();
			mid++;
			end+=2;
		}
	}
}

// A
// ABA
// ABCBA
// ABCDCBA
// ABCDEDCBA