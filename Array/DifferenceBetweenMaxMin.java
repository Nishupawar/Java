public class DifferenceBetweenMaxMin {
    public static void main(String[] args) {
        int[] a= {11,22,33,44,55};
             int max = Integer.MIN_VALUE;
             int min= Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if (a[i] < min) 
            {
                min = a[i]; 
            }
             if (a[i] > max) 
             {
                max = a[i]; 
            }
        }
        System.out.println("Max Value : "+max);
        System.out.println("Min value : "+ min);
        System.out.println("Difference Between : "+(max-min));
    }}

