public class Diagonal {
    public static void main(String[] args) {
        int[][] a={{1,2,3,4},{5,6,7,8},{7,8,9,2},{7,3,8,6}};  
                           //1 2 3 4
                           //5 6 7 8
                           //7 8 9 2
                           //7 3 8 6          
        int sum=0;
        int cnt=0;
        //first diagonal
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(j+i==a.length-1)
                {
                    System.out.print(a[i][j]+" ");
                     sum=sum+a[i][j]; 
                     cnt++;                  
                }
                else{
                    System.out.print(" ");
                }  
            }
            System.out.println();
        }
             System.out.println("sum : "+sum);
            System.out.println("count : "+cnt);
             int avg=sum/cnt;
            System.out.println("avg : "+avg);
    }
}
