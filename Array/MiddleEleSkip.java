public class MiddleEleSkip {
    public static void main(String[] args) {
        int [][] a={{1,2,8,3},{4,2,5,6},{6,7,4,8}};
        for(int i=0;i<a.length;i++)
        {
         for(int j=0;j<a[i].length;j++)
         {
              if(i==0 || i==a.length-1 || j==0 || j==a.length-1)
              {
     System.out.print(a[i][j]);
              }
             
              else
              {
              System.out.print("  ");
              }
         }
         System.out.println();
        }
    }
}

// 1283
// 4  5
// 6748