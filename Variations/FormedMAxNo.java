public class FormedMAxNo {
   
	
		public static void main(String[] args) 
		{
			int num = 38293367;
			myCode(num);
		}
		//EndOfMainMethod
		private static void myCode(int num)
		{
			System.out.println(printMaxNum(num));
		}
		static int printMaxNum(int num)
		{
			int count[] = new int[10];
			String str = Integer.toString(num);
			for(int i=0; i < str.length(); i++)
			count[str.charAt(i)-'0']++;
			int result = 0, multiplier = 1;
			for (int i = 0; i <= 9; i++)
			{
				while (count[i] > 0)
				{
					result = result + (i * multiplier);
					count[i]--;
					multiplier = multiplier * 10;
				}
			}
		
			return result;
		}
	}
