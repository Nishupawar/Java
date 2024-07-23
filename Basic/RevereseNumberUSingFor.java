public class RevereseNumberUSingFor {
    public static void main (String[]args)
    {
int num=1234;
        int rev=0;
		for(int i=num;i>0;)
		{
			int rem= i%10;
			rev= rev*10+rem;
			i=i/10;
		}
		System.out.println(rev);
	}
        //output
      //  System.out.println ("Reversed Number: " + reverse);
    }

