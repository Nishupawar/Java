public class PrintArrayUsingDoWhileLoop {
    public static void main(String[] args) {
        int [] a={10,20,30,40,50,60};
        int i=0;
        do
        {
            System.out.print(a[i]+" ");
            i++;
        }while(i<a.length);
    }
}
