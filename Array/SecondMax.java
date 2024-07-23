public class SecondMax {
    public static void main(String[] args) {
        int [] a={12,34,67,85,4,66,6};
        int max= Integer.MIN_VALUE;
        int SecondMax= Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) 
        {
            if(a[i]>max){
            SecondMax = max;
            max=a[i];
            }
        if(a[i]>SecondMax && a[i]!=max)
        SecondMax=a[i];
        }
        System.out.println("SecondMax : "+SecondMax);


        
    }

}