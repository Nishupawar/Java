import java.util.Arrays;
public class CopyArray {
    public static void main(String[] args) {
        int[] a= {12,23,45,767,88};
         int[] b= new int[a.length];

         for(int i=0;i<a.length;i++)
         {
            b[i]=a[i];
         }
           //  System.out.print(Arrays.toString(b));
           //  System.out.println("*");
         for(int i=0;i<b.length;i++)
         {     
            System.out.println(b[i]+" ");
         }
         
    }
}
