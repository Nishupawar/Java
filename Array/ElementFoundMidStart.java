public class ElementFoundMidStart {
    public static void main(String[] args) {
        int [] a={11,22,33,44,55,66};
        int start=0;
        int end=a.length-1;
        int elem=25; int cnt=0;
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(a[mid]==elem) {
                cnt++;
                System.out.println("found"); 
                break;
            }
            if(elem>a[mid])
            start = mid+1;
            else
            end= mid-1;
        }
        if(cnt==0)
        System.out.println("not found");
        
    }
}
