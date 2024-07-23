public class Max {
    public static void main(String[] args) {
            
           
        int[] a= {12,233,455,667,7};
         int max= Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
max=a[i];
        }
        System.out.println(max);
    }
}
