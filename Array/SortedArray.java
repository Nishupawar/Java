public class SortedArray {
    public static void main(String[] args) {
        int cnt=0;
        int num=14;
        int mid=0;
        int[] arr= {1,8,9,12,14,25};
        int upper= arr.length;
        int lower=0;
        mid = lower+(upper-lower)/2;
        while(lower<=upper)
        {
if(num>=arr[mid])
{
mid = mid+1;
lower=mid;
}
else
{
    mid=mid-1;
    upper=mid;
}
if(num==arr[mid])
{
cnt++;
break;
}
  }
if(cnt==1)
System.out.println("found");
else
System.out.println("not found");
    }
}
