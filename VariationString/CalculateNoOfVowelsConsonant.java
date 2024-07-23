package VariationString;

public class CalculateNoOfVowelsConsonant {
    public static void main(String[] args) 
	{
		String str = "I am a good girl"; 
		myCode(str);
	}
	//EndOfMainMethod
	public static void myCode(String str) 
	{
		str=str.toLowerCase();
		int vCount=0;
		int cCount=0;
		for(int i = 0; i < str.length(); i++) 
		{
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') 
			vCount++;  
			else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') 
			cCount++;  
		}
		System.out.println("Number of vowels: " + vCount);  
		System.out.println("Number of consonants: " + cCount);  
	}
}
