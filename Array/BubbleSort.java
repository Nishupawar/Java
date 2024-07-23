import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a={23,78,5,4,77,90};
        
            for (int i = 0; i < a.length; i++) 
        {
                for(int j=0;j<a.length;j++)
           {
                if(a[j]>a[i])
                {
                    int temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        //}
            //System.out.println(Arrays.toString(a));
        
        System.out.println(Arrays.toString(a));
    }
}
