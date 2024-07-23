public class Pattern86 {
    public static void main(String[] args) {

        for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
                if(i==j)
				System.out.print("X");
                else
                System.out.print("O");
			}
			System.out.println();
		}
    }
}

// XOOOO
// OXOOO
// OOXOO
// OOOXO
// OOOOX

