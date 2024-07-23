public class InvestValue {
    public static void main(String[] args) 
	{
		double p=12;
		double r=13;
		double y=15;
		myCode(p,r,y);
	}
	//EndOfMainMethod
	private static void myCode(double p,double r,double y)
	{
		//fiv=p*Math.pow((1+r/100),y);
		double future= p*Math.pow((1+r/100),y);
		System.out.print("value is: "+future);
	}
}

