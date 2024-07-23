package HefShineMap;

import java.util.Arrays;
import java.util.HashSet;

public class ConvertaHashSetToAnArray {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(50);
        hs.add(60);

        int[] a = myCode(hs);
        System.out.println(Arrays.toString(a));
    }

    public static int[] myCode(HashSet<Integer> hs) {
        // Convert HashSet to an array
        int[] a = new int[hs.size()];
        int index = 0;
        for (int num : hs) {
            a[index++] = num;
        }
        return a;
    }
}