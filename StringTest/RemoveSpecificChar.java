public class RemoveSpecificChar {
public static void main(String[] args) {
    String s1="Aabcd";
    char ch= 'd';
    String s2="";
    for(int i=0;i<s1.length();i++)
    {

        if(s1.charAt(i)!=ch)
        s2= s2+s1.charAt(i);
    }
    System.out.println(s2);
}
}
 