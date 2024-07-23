import java.util.Arrays;

public class SortWord
 {
    public static void main(String[] args)
     {
        String[] s1={"hi","to","u","Welcome"};
  for (int i = 0; i < s1.length; i++)
   {
    for (int j = i+1; j < s1.length; j++) 
    {
        if(s1[i].length()>s1[j].length())
        {
                String temp=s1[i];
                s1[i]=s1[j];
                s1[j]=temp;
        }
        
    }
    
  }
    System.out.println(Arrays.toString(s1));
}
 }

