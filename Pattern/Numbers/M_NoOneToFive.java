public class M_NoOneToFive {
	public static void main(String[] args) {

		int mid1=1;
       int mid2=10;
       int cnt=1;
       for(int i=1;i<=5;i++)
       {
        for(int j=1;j<=10;j++)
        {
            if(j>mid1 && j<mid2)
            {
                System.out.print(" ");
            }
            else
            {
                System.out.print(cnt);
            }
        }
        System.out.println();
        mid1++;
        mid2--;
        cnt++;
       }
			
	}
}


// 1        1
// 22      22
// 333    333
// 4444  4444
// 5555555555