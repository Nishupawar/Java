package VariationArray;

public class MultiDivMethodReturrn {
    public static void main(String[] args) {
        int num1=12;
        int num2=6;
        
        int[] a= multi(num1,num2);
        System.out.println("Multiplication : "+a[0]);
        System.out.println("Division : "+a[1]);
        
    }
    public static int[] multi(int num1,int num2)
    {
        int multi=num1*num2;
        int div= num1/num2;
        
        int []a= new int[2];
        a[0]=multi;
        a[1]=div;
        return a;
        
    }
}
