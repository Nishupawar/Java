package VariationString;

public class RemoveAllNonAlphaNumeric {
    public static void main(String[] args) 
	{
		//Given string str"Geeks_for$ Geeks?
		{
		}
		String str = "abc45";
		myCode(str);
	}
	//EndOfMainMethod
	private static void myCode(String str)
	{
		for(int i=0;i<str.length();i++)
		{
			if((str.charAt(i)>='a' && str.charAt(i)<='z') || 
			(str.charAt(i)>='0' && str.charAt(i)<='9') || 
			(str.charAt(i)>='A' && str.charAt(i)<='Z'))
			System.out.print(str.charAt(i));
		}
}
}