public class TriangleSeries {
    public static void main(String[] args) {
        //1 , 3(1+2) , 6(1+2+3) ,10(1+2+3+4)
    //      *
    //     * *
    //    * * *
    //   * * * *
       int sum=0;
        int j=1;
        int k=1;
        for(int i=1;i<=2;i++)
        {
            sum=sum+k;
           // System.out.print(k+" ");
            j=j+1;
            k=k+j;
        }
        System.out.println(sum);
    }
}
