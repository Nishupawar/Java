public class SelectionSort {
    public static void main(String[] args) {
        int a[]= {12,34,2,6,88};
        for(int i=0;i<a.length;i++)
        {
            int min=i;
            for(int j=i;j<a.length;j++)
            {
                if(a[j]<a[min])
                {
                    min=j;
                }
            }
            int c=a[i];
            a[i]=a[min];
            a[min]=c;
            System.out.print(a[i]+" ");
        }
    }
}
