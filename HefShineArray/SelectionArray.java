package HefShineArray;
/*It adds one element in each iteration. You need to select the
 *  smallest element in the array and move it to the beginning of
 *   the array by swapping with the front element.
 */
public class SelectionArray {
    public static void main(String[] args) {
		
	
        int[] a= {12,3,84,2,9,34,11};
        int temp=0;
        int min;
        for(int i=0;i<a.length;i++)
        {
            min=i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]<a[min])
                    min=j;
            }
            temp=a[i];
            a[i]=a[min];
            a[min]=temp;
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
        
        }
}
