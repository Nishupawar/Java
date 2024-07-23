public class Pentagon {
    //StartOfMainMethod
	public static void main(String[] args) 
	{
		float a = 5;
		myCode(a);
	}
	//EndOfMainMethod
	private static void myCode(float a)
	{
		System.out.println("Area of Pentagon: "+area(a));
	}
	private static float area(float a)
	{
		float area= (float)((Math.sqrt(5*(5+2*(Math.sqrt(5))))*a*a)/4);
		return area;
	}
}
