package VariationArray;

public class FindExtraEleUsingWhileLoop {
    public static void main(String[] args) {
        int[] a= {1,2,3,5,6};
        int[]b= {1,2,3,4,6};
        
        int i=0;
        while(true)
        {
            if(a[i]==b[i])
                i++;
            else
            {
                System.out.println(i);
            break;
            }
        }
    }
}
