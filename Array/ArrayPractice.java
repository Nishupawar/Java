public class ArrayPractice {
    public static void main(String[] args) {

        int[] arr = { 10, 20, 30, 40, 50,60,70 };
        int ans = arr[3];
        System.out.println(ans);

        int[] a = new int[5];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        for (int i = 0; i <= arr.length; i++) {
            System.out.println(a[i]);
        }
    }
}
