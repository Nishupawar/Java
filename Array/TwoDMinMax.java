import java.util.Arrays;

public class TwoDMinMax {
    public static void main(String[] args) {
        int[][] a= {{1,2,3},{4,5,6},{7,8,9},{9,4,6}};
        int min= Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j]<min)
                min= a[i][j];

                if(a[i][j]>max)
                max= a[i][j];
                
            }
        }
        
            System.out.println("min : " +min);
        System.out.println("max : "+max);
    }
}
