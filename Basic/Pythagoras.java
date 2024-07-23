public class Pythagoras{
	public static void main(String[] args){
		// c²=a² + b² 
		//c= Math.sqrt(Math.pow(a,2)+Math.pow(b,2)
		int a=2;
		int b=3;
		int c= (a*a) +(b*b);
		double d= Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
		System.out.println(c);
		System.out.println(d);
		
		//d^2=e^2+f^2
		double e=2.5;
		double f=3.4;
		double d1= Math.sqrt(Math.pow(e,2)+Math.pow(f,2));
		System.out.println(d1);
	}
}