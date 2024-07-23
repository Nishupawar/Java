public class SizeOfSubArray {
    public static void main(String[] args) {
        int []  a={3,7,90,20,5,50,40};
        int min= Integer.MAX_VALUE;
   int start = -1;
   int SizeOfSubArray=3;
   for(int i=0;i<=a.length-SizeOfSubArray;i++)
   {
    int sum =0;
    for(int k=i;k<i+SizeOfSubArray;k++) {
        sum =sum+a[k];
    }
    int avg= sum/SizeOfSubArray;
    if(avg<min){
        min=avg;
        start =i;
    } }
   System.out.println(min);
   System.out.println(start);
    }
}
