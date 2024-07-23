package VariationString;

public class ContainsOnlyWwhiteSpace {
    public static void main(String[] args) 
	{
		String str = "GeeksforGeeks";
		myCode(str);
	}
	//EndOfMainMethod
	private static void myCode(String str1)
	{
		System.out.print("Is string ["+str1+"] only whitespaces? "+check(str1));
	}
	public static boolean check(String str1)
	{
		if(str1.trim().isEmpty())
		return true;
		else
		return false;
	}
}
