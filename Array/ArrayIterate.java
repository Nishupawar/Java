public class ArrayIterate {

    public static void main(String[] args) {
       //conditional71
       
      int[][] a= {{12,12,67},{6,5,9},{8,4,3}};
      int sum =0;
      for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < a[i].length; j++) {
            if(i==j)
            sum=sum+a[i][j];
        }
      }
      for (int i = 0; i < a.length; i++) 
      {
        for (int j = 0; j < a[i].length; j++) 
        {
        System.out.print(a[i][j]+" ");
      }
      System.out.println();
    }
    }

}
