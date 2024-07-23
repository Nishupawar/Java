public class Armstrong {
   //StartOfMainMethod
	public static void main(String[] args) 
	{
		int num=370;
		myCode(num);
	}
	//EndOfMainMethod
	public static void myCode(int num) 
	{
		//write code here
		int temp=num;
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			sum= sum+(rem*rem*rem);
			num= num/10;
		}
		if (sum==temp) 
		{
			System.out.println("Armstrong Number");
		}
		else
		System.out.println("Not Armstrong number");
	}
}
