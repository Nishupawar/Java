package VariationArray;

public class RemoveLeading {
    public static void main(String[] args) 
	{
		String str = "00000123569";
		myCode(str);
	}
	//EndOfMainMethod
	private static void myCode(String str) 	
	{
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!='0')
			System.out.print(str.charAt(i));
		}
	}
}
