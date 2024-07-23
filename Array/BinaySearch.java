public class BinaySearch {
    public static void main(String[] args) {
        int a[]= {1,2,3,4,5,6,7,8,9};
		int start=0;
		int end=a.length-1;
		int num=6;
		int cnt=0;

		while(start<=end)		{
			int mid=(start+end)/2;
			if(num==a[mid])
			{ 		
				System.out.println("found at index "+ mid);
                cnt++;
				break;	
			}
			if(num>a[mid])
			{
				start=mid+1;
			}
			else
            {
				end=mid-1;
			}
			
		}
		if(cnt==0)
		{
			System.out.println("index not found");
		}
		

    }
}

