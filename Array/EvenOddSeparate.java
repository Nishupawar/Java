public class EvenOddSeparate {
    public static void main(String[] args) {
        int []a ={11,22,33,444,55,66};
        System.out.print("Even Numbers : ");
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2==0)
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.print("Odd Numbers : ");
        for (int i = 0; i < a.length; i++) {
            if(a[i]%2!=0)
            System.out.print (a[i]+" ");
        }
    }
}
