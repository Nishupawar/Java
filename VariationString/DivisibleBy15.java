package VariationString;

public class DivisibleBy15 {
    //StartOfMainMethod
	public static void main(String[] args) 
	{
		String S = "15645746327462384723984023940239";
		myCode(S);
	}
	//EndOfMainMethod
	private static void myCode(String s)
	{
        if(isDiv(s)==true)
        System.out.println("Yes");
        else
        System.out.println("No");
	}
    public static boolean isDiv(String s)
    {
        int n=s.length();
        if(s.charAt(n-1)!= '5' && s.charAt(n-1) !='0')
        return false;
        int sum=0;
        for (int i = 0; i < s.length(); i++) {
            sum=sum+(int) s.charAt(i);

        }
        if(sum%3==0)
        {
            return true;
        }
        else
        return false;
    }
}
