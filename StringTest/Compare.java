public class Compare {
    public static void main(String[] args) {
        String s1="abcd";
	String s2="abcd";
	//String s2= new String("abcd");
	//System.out.println(s1==s2);
	//System.out.println(s1.equals(s2));

    //2nd method
int cnt=0;
    if (s1.length() == s2.length())
		{
			for (int i = 0; i < s1.length(); i++) 
			{
				if (s1.charAt(i) == s2.charAt(i))
					cnt++;			
			}
				if (cnt == s1.length())			
					System.out.println(true);
			      else
					System.out.println(false);
		}
		else 
			System.out.println("false");
		
    }
}
