package VariationArray;

public class MakeItPossible {
    public static void main(String[] args) {
        int a[]={40,50,90};
        int rem=0;
        for(int i=0;i<a.length;i++)
        {
            rem= (rem+a[i])%3;
        }
        if(rem==0)
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}
