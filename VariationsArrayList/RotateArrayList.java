package VariationsArrayList;

import java.util.ArrayList;

public class RotateArrayList {
    public static void main(String[] args) {
        int[] a= {1,2,3,4,5,6};
        int temp=a[0];
        for (int i = 0; i < a.length-1; i++) 
        {
            a[i]=a[i+1];
        }
        a[a.length-1]=temp;
        ArrayList<Integer> al = new ArrayList<>();
        for(int b:a)
        {
            al.add(b);
        }
        System.out.println(al);
    }
}
