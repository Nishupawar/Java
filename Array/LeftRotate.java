public class LeftRotate {
 public static void main(String[] args) {
    int[] a={11,22,33,44,55}; // 22 33 44 55 11
int temp= a[0];
    for (int i = 0; i < a.length-1; i++) {
        a[i]=a[i+1];
    }
    a[a.length-1]=temp;
    for (int i = 0; i < a.length; i++) {
        System.out.print(a[i]+" ");
    }
 }   
}
