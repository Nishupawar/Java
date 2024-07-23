package VariationArray;

public class SumOfThirty {
    public static void main(String[] args) {
         int a[]={10,10,10,2};
  boolean result= sum(a);
  System.out.println(result);
    }
    private static boolean sum(int[] a) {
	
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==10)
            sum=sum+a[i];
        }
        if(sum==30)
            return true;
        return false;
    }
}
