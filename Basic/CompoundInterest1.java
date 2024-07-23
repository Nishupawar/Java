/*
A = P (1+r/n)nt
a=amount(Prinple+Interest)
P is principal amount
R is the rate and
T is the time span
*/
public class  CompoundInterest1{
	public static void main(String[] args)
	{
		int p=1000;
		double r=5/100.0;
		int n=12;
		int t=5;
		
		double fpart= 1+r/n;
		int spart= n*t;
		
		double a= p*Math.pow(fpart,spart);
		System.out.println(a);
	}
}