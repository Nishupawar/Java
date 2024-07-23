import java.util.Arrays;

public class RemoveEle {
    public static void main(String[] args) {
        int[] a = { 3, 4, 5, 6, 46, 4, 9, 6, 4 };
        int ele = 4;
        int cnt = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == ele)
                cnt++;
        }
        System.out.println("cnt : "+cnt);

        int[] b = new int[a.length - cnt];

        int index = 0;
        
        for (int i = 0; i < a.length; i++)
         {
            if (a[i] != ele){
                b[index++] = a[i];
              
            }
        }
        for (int i = 0; i < b.length; i++) 
         {
            System.out.print(b[i]+" ");
         }
    }
}
