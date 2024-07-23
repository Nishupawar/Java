public class BubbleSortArray {
    public static void main(String[] args) {
        int arr[]={12,56,34,23,98};
        int len= arr.length;
        int cnt=0;
        for(int round=0;round<(len-1);round++)
        {
            for(int j=0;j<(len-1-round);j++)
            {
                if(arr[j]>arr[j+1])
                {
                    //swap elements  
                     int c= arr[j];  //c=a
                     arr[j]=arr[j+1];  //a=b
                     arr[j+1]=c;       //b=c
                     cnt++;
                }
          }
        //   if(cnt==0)
        //   {
        //     System.out.println("Array Sorted"+arr[round]);
        //     break;
        //   }
     }
     for(int i=0;i<arr.length;i++)
     {
        System.out.print(arr[i]+" ");
     }
    }
}
                          
                                 
                                 
                                 