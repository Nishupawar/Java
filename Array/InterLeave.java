import java.util.Arrays;

public class InterLeave {
    public static void main(String[] args) {
        int[] a = { 1, 3, 5, 6 };
        int[] b = { 3, 5, 6, 7 };
        int[] c = new int[a.length + b.length];
        int index = 0;
        for (int i = 0; i < a.length || i < b.length; i++)
         {
            if (i < a.length)
                c[index++] = a[i];
            if (i < b.length)
                c[index++] = b[i];
        }
        System.out.println(Arrays.toString(c));
        for (int i = 0; i < c.length; i++)
         {
            System.out.print(c[i] + " ");
        }
    }
}
