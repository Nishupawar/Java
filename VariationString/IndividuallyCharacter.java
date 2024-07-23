package VariationString;

public class IndividuallyCharacter {
    public static void main(String[] args) 
	{
		String string = "characters";  
		myCode(string);
	}
	//EndOfMainMethod
	private static void myCode(String string) 	
	{
		System.out.println("Individual characters from given string: ");
		for (int i = 0; i < string.length(); i++) {
			System.out.print(string.charAt(i)+" ");
		}
	}
}
