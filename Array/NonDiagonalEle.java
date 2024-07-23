public class NonDiagonalEle {
    public static void main(String[] args) {
        
        int[][] a={{1,2,3,4},{5,6,7,8},{7,8,9,2},{7,3,8,6}};  
                           //1 2 3 4
                           //5 6 7 8
                           //7 8 9 2
                           //7 3 8 6          
        int sum=0;
        int cnt=0;
       // int[][] a={{1,2,3},{4,5,2},{7,8,9},{7,3,8}};
        //find non diagonal elemenet
       // i  j  j+i!=a.length-1 && j-i!=0
       // 0  0   0!=3 && 0!=0   false
       // 0  1   1!=3 && 1!=0   true
       // 0  2   2!=3 && 2!=0   true
       // 0  3   3!=3 && 3!=0   false
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if(j+i!=a.length-1 && j-i!=0)
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
//  2 3  
// 5   8 
// 7   2 
//  3 8  

// sum : 38
// count : 8
// avg : 4
