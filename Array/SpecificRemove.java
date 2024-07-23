public class SpecificRemove {
    public static void main(String[] args) {
        int[] a = { 11, 22, 33, 44, 33, 55, 22, 11, 66 };
        int cnt = 0;
        int Element = 11;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == Element) {
                cnt++;
            }
        }
        int index = 0;
        int[] b = new int[a.length - cnt];
        for (int i = 0; i < a.length; i++) {
            if (a[i] != Element) {
                b[index] = a[i];
                index++;
            }
        }

        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
