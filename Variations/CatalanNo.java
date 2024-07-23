public class CatalanNo {
    //StartOfMainMethod
		public static void main(String[] args) 
		{
			int a = 8;
			myCode(a);
		}
		//EndOfMainMethod
		private static void myCode(int n)
		{
			CatalanNo cn = new CatalanNo();
			for (int i = 0; i < n; i++) 
			{
				System.out.print(cn.catalan(i) + " ");
			}
		}
		int catalan(int n)
		{
			int res = 0;
			// Base case
			if (n <= 1) 
			{
				return 1;
			}
			for (int i = 0; i < n; i++) 
			{
				res += catalan(i) * catalan(n - i - 1);
			}
			return res;
		}
}
