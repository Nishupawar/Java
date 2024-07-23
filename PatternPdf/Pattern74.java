//package PatternPdf;

public class Pattern74 {
	public static void main(String[] args) {
		int end = 5;
		int mid = 4;
		for (int i = 1; i <= 5; i++) {
			int cnt = 1;
			for (int j = 1; j <= end; j++) {
				if (j <= mid)
					System.out.print(" ");
				else {
					System.out.print((char) (cnt + 64));
					if (j < 5)
						cnt++;
					else
						cnt--;
				}
			}
			System.out.println();
			mid--;
			end++;
		}
	}
}

//     A
//    ABA
//   ABCBA
//  ABCDCBA
// ABCDEDCBA