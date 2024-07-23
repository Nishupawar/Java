import java.util.Arrays;

import javax.sound.sampled.SourceDataLine;

public class RotateArray {
    public static void main(String[] args) {
        int[] a={11,22,33,44,55};//left [22,33,44,55,11]
       int temp=a[0];
        for(int i=0;i<a.length-1;i++) {
        a[i]=a[i+1];
        }
        a[a.length-1]=temp;
        System.out.println("left shift");
        System.out.println(Arrays.toString(a));
        //right
     int[] b={11,22,33,44,55};//right [55,11,22,33,44]
        int temp1=b[b.length-1];
        for(int i=b.length-1;i>0;i--) {
           b[i]=b[i-1];
        }
        b[0]=temp1;
     System.out.println("right shift");
    System.out.println(Arrays.toString(b));
}
}
