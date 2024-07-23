public class SumAvgOfInnerElem {
    public static void main(String[] args) {
        int[][] a={{1,2,3,4},{5,6,7,8},{7,8,9,2},{7,3,8,6}};  
                           //1 2 3 4
                           //5 6 7 8
                           //7 8 9 2
                           //7 3 8 6    
        int sum=0;
        int avg=0;
        int cnt=0;
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-1; j++) {
                sum= sum+a[i][j];
                cnt++;
            }
        }
            System.out.println("sum of inner Element : "+sum);
            avg= sum/cnt;
            System.out.println("avg of inner Element : "+avg);
        
    }
}
