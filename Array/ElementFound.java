public class ElementFound {
    public static void main(String[] args) {
        int[] arr=  {12,45,45,67,55,88};
        int ele=88;
        int cnt=0;
        int i=0;
        for(;i<arr.length;i++) {
            if(arr[i]==ele)
            {
                System.out.println("Element found : "+i);
                cnt++;
                break;
            }
        }
if(cnt==0)
System.out.println("Element not Found"+ -1);
}
}