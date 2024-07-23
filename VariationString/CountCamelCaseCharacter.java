package VariationString;

public class CountCamelCaseCharacter {
    
	//StartOfMainMethod
	public static void main(String[] args) 
	{
		String s="ckjkUUYII";
		myCode(s);
	}
	//EndOfMainMethod
	public static void myCode(String S)
	{
		//Write code here
		countCamelCase(S);
	}
	static void countCamelCase(String S)
	{
		int count = 0;
		for(int i = 0; i < S.length(); i++)
		{
			if (S.charAt(i) >= 65 && S.charAt(i) <= 91) 
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
