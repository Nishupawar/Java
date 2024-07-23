import java.util.Arrays;

public class InterLeaveChar {
    public static void main(String[] args) {
    char [] a = {'a','b','c','d'};
    char [] b= {'w','x','y','z'};
     char [] c = new char[a.length+b.length];
    int index= 0;
    for(char i =0; i< a.length || i<b.length ;i++)
    {
          if(i<a.length)
         c[index++] =a[i]; 
          if(i<b.length)
           c[index++] =b[i]; 
    }
    System.out.println(Arrays.toString(c));
    for(char j=0;j< c.length; j++)
    {
        System.out.print(c[j]+" ");
    }
}
}
