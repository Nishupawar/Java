package VariationArray;

public class OneComplement {
    public static void main(String[] args) 
	{
		int N = 3;
		String S = "101";
		myCode(N, S);
	}
	//EndOfMainMethod
	public static void myCode(int N, String S) 
	{
		char[] ch=S.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='1')
			ch[i]='0';
			else if(ch[i]=='0')
			ch[i]='1';
			System.out.print(ch[i]);
		}
	}

}
