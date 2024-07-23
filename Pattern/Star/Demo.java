public class Demo {
	public static void main(String[] args) {
int end=1;
		for (int i = 1; i <=5; i++) {
			for (int j = 1; j <=end; j++) 
			{
				if(j>end)
				System.out.print(" ");
				else
				System.out.print("*");
			}
			end++;
			System.out.println();
		}
			
	}
}
