package VariationArray;

public class DoublingTheValue {
    public static void main(String[] args) {
        int[] a= {1,2,3,4,8,16};
        int b=2;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==b)
                b=b*2;
        }
        System.out.println(b);
    }
}
