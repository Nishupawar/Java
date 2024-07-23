package Method;

import java.util.Scanner;

public class Bank {
    Scanner s=new Scanner(System.in);
	
	private final String userName="admin";
	private final long passWord=1234;
	long depoAmount;
	private double acBalence;
	long withAmount;
	
	public Bank(String cName,long cPass)
	{
		if(userName.equals(cName) && passWord==cPass)
				insert();
		else
		{
			 System.out.println("UserName Password MissMatch");
			 System.out.println("**Please Try Again**");
			 MainForBank.method();
		}
	}
	public void insert() 
	{
		 System.out.println("Options:-");
		 System.out.println();	 
		 System.out.println("For Deposit: 1");
		 System.out.println();
		 System.out.println("For Withdral: 2");
		 System.out.println();
		 System.out.println("For Check Balence: 3");
		 int num=s.nextInt();
		 
		 switch(num)
		 {
		 case 1 : deposit();
		 break;
		 case 2 : withdral();
		 break;
		 case 3 : checkBalence();
		 break;
		 default : System.out.println("**Please Enter Valid Data**");
		 break;
		 
		 }
	}


	public void checkBalence() 
	{
		System.out.println("Available Balence is : " + "Rs." + acBalence);
	}


	public void withdral()
	{
		System.out.println("Enter Amount to Withdral");
		withAmount=s.nextLong();
		if(withAmount<=acBalence)
		{
			acBalence=acBalence-withAmount;
			System.out.println("Rs." + withAmount + " Debited from A/c...");
			checkBalence();
		}
		else
		{
			System.out.println("**insaficeant Balence***");
		}
		
	}


	public void deposit()
	{
		System.out.println("Enter Amount to deposit");
		depoAmount=s.nextLong();
		acBalence=acBalence+depoAmount;
		System.out.println("Rs. " + depoAmount + " Credited Successfully");
		withdral();
	}
	


	
}
