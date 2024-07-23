import java.util.*;

public class LowestLargestString {
    public static void main(String[] args) {
        String s="hi welcome to the hefshine campus";
        String [] s1 = s.split(" ");
   System.out.println(Arrays.toString(s1));

   for (int i = 0; i < s1.length; i++) {
    for (int j = i+1; j < s1.length; j++) {
        if(s1[i].length()>s1[j].length())
        {
                String temp=s1[i];
                s1[i]=s1[j];
                s1[j]=temp;
        }
    }
   }
   System.out.println(s1[0]);
   System.out.println(s1[s1.length-1]);
    }
}
