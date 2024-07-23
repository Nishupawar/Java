public class MinMoveToFrontOperations {
    static int minMoves(int arr[], int n)
    {
      
        int cnt = n;
        for (int i = n - 1; i >= 0; i--)
        {
            if (arr[i] == cnt)
                cnt--;
        }    
        return cnt;
    }
    public static void main (String[] args)
    {
    	int[] arr= {3,2,1,4,5};
        int n = arr.length;
        System.out.println( minMoves(arr, n));
 
    }
}
