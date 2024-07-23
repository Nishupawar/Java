public class Relational{
public static void main(String[]args)
{
char ch='n';
char ch1='a';
boolean re,re1,re2,re3,re4,re5;
re= ch < ch1;
re1= ch > ch1;
re2= ch <= ch1;
re3= ch >= ch1;
re4= ch == ch1;
re5= ch != ch1;
System.out.println("ch < ch1 =="+re);//false
System.out.println("ch > ch1 ==" +re1);//true
System.out.println("ch <= ch1 =="+re2);//false
System.out.println("ch >= ch1=="+re3);//true
System.out.println("ch == ch1 =="+re4);//false
System.out.println("ch != ch1 =="+re5);//true

System.out.println("**********************");
float a=20.66f;
float b=20.56f;
boolean result,result1,result2,result3,result4,result5;
result = a<b;
result1 = a>b;
result2 = a<=b;
result3 = a>=b;
result4 = a==b;
result5 = a!=b;
System.out.println("a < b =="+result);//false
System.out.println("a > b == "+result1);//true
System.out.println("a <= b == "+result2);//false
System.out.println("a >= b =="+result3);//true
System.out.println("a == b =="+result4);//false
System.out.println("a == b =="+result5);//true

/*boolean b1=true;
boolean b2=false;
boolean r= b1>b2;
System.out.println("a == b =="+r);
*/
}
}