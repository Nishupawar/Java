public class EquilateralTriangle
{
public static void main(String[] args)

{
//	perimeter of EquilateralTriangle= 3*a
int a=3;
int perimeter = 3*a;
System.out.println("perimeter :"+perimeter);

//area of EquilateralTriangle= 1/2*b*h
//area of EquilateralTriangle= roor 3/4 *a^2
double area= Math.sqrt(3)/4*(Math.pow(a,2));
System.out.println("area :"+area);
}
}