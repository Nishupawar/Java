package VariationString;
public class ConcateTwoStringThenReverse {
    public static void main(String[] args) 
		{
			String s1="hef";
			String s2="Shine";
			myCode(s1,s2);
		}
		//EndOfMainMethod
		public static void myCode(String s1,String s2) 
		{
			//Write code here
			String con =s1+s2;
			//System.out.println(con);
			String rev="";
			for(int i=con.length()-1;i>=0;i--)
			{
				rev= rev+con.charAt(i);
			}
			System.out.println(rev);	
		}
}
