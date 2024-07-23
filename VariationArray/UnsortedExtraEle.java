package VariationArray;

public class UnsortedExtraEle {
    public static void main(String[] args) {
        int[] a= {15,89,1,2,3,45,5,6};
        int[]b= {1,2,3,4,6,45};
        
        for(int i=0;i<a.length;i++)
        {
            boolean result = karan(b,a[i]);
            if(result==false)
            System.out.println("Index "+i+" : "+a[i]);
        }
    }
    
    private static boolean karan(int[] b, int num) {
        for(int i=0;i<b.length;i++)
        {
            if(b[i]==num)
                return true;
        }
        return false;
    }
    
}
