import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a={22,11,33,66,55,44};
        for(int i=0;i<a.length;i++)
        {
            int temp=a[i];
            int j= i-1;
            for(;j>=0;j--)
            { 
                if(a[j]>temp)
                a[j+1]=a[j];
                else
                break;
            }
            a[j+1]=temp;
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
       // System.out.println(Arrays.toString(a));
    }
}
