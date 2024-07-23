package VariationArray;

public class DigitInProduct {
    public static void main(String[] args) {
        int[] a= {8,5,3,7,4};
        int product=1;
        for(int i=0;i<a.length;i++)
        {
            product = product*a[i];
        }
        System.out.println(product);
        String s="";
        s=s+product;
        System.out.println(s.charAt(0));
    }
}
