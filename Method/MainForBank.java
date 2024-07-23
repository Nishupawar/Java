package Method;

import java.util.Scanner;

public class MainForBank {
    public static void main(String[] args) 
	{
		method();
	}
	public static void method()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("WELCOME TO STATE BANK OF INDIA");
		System.out.println();
		System.out.println("Enter UserName:");
		String uname=s.nextLine();
		
		System.out.println("Enter PassWord:");
		long upass=s.nextLong();
		
		String uname1=uname;
		long upass1=upass;
		
		Bank b1=new Bank(uname1,upass1);
	}

}
