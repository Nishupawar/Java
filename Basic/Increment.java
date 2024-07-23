public class Increment{
public static void main(String[] args)
{
	/*int a=10;

	int a1= a++;// 1st a value print then add 1 and pass add 1 value to next
	int a2= ++a;//recive vale +add 1
	System.out.println("The valiue of a1 is =="+a1);//10
	System.out.println("The valiue of a2c is =="+a2);//12
	
	*/
	
	int a=5;
	System.out.println(++a);// 6   6
	System.out.println(a++);// 6   7
	System.out.println(a);//   7   7
	System.out.println(a--);// 7   6
	System.out.println(a);//   6   6
	System.out.println(--a);// 5   5
	System.out.println(a++);// 5   6
	System.out.println(a--);// 6   5
	System.out.println(--a);// 4   4
	System.out.println(a++);// 4   5
	System.out.println(--a);// 4   4
	System.out.println(a);//   4
}
}