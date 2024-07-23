package VariationString;

public class MagicString {
    //StartOfMainMethod
	public static void main(String[] args) 
	{
		String S="varun";
		myCode(S);
	}
	//EndOfMainMethod
	public static void myCode(String S) 
	{
		System.out.println( magic(S));
	}
	public  static String magic(String S) 
	{
		char[] ch = S.toCharArray();
		for (int i = 0; i < ch.length; i++) 
		{
			char str = ch[i];
			if (str >= 'a' && str <= 'z') 
			{
				ch[i] = (char) ('z' - (str - 'a'));
			}
		}
		return new String(ch);
	}

}
