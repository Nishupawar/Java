public class WithoutVariable{
public static void main(String[] args)
{
int a=12;
int b=34;
a=a+b;
b=a-b;
a=a-b;
System.out.println(a);
System.out.println(b);
int c=3;
int d=5;
c=c*d;
d=c/d;
c=c/d;
System.out.println(c);
System.out.println(d);
}
}