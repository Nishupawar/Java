public class Concatination{
public static void main(String[] args)
{
char ch='"';
System.out.println("Hef"+ch+"Shine");//Hef"Shine

System.out.println("Hef\"Shine");//Hef"Shine

System.out.println(ch+"HefShine"+ch);
System.out.println("\"HefShine\"");//"HefShine"

System.out.println("Hef\nShine");
/*new line 
Hef
Shine*/

System.out.println("Hef\tShine");//tab
System.out.println("Hef\sShine");//one space
System.out.println("Hef\rShine");//remove  before \r

System.out.println("Nishi\bgandha");//remove only one letter before \r
System.out.println("Nishigandha");//


}
}