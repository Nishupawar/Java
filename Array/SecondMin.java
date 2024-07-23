public class SecondMin {
    public static void main(String[] args) {
        int [] a={12,34,67,85,4,6};
        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++)
         {
            if(a[i]<min)
            {
            secondMin=min;
            min=a[i];
            }
            if(a[i]<secondMin && a[i]!=0)
            secondMin=a[i];

        }
        System.out.println("secondMin : "+secondMin);

    }
}
