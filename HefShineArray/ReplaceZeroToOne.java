package HefShineArray;

public class ReplaceZeroToOne {
    public static void main(String[] args) {
        int[] a=
            {
                1,0,1,0,1,0,1,0
            }
            ;
            replace(a);
        }
        //EndOfMainMethod
        private static void replace(int[] a) 
        {
            //code here
            for(int i=0;i<a.length;i++)
            {
                if(a[i]==0)
                a[i]=1;
                System.out.print(a[i]+" ");
            }
        }       
}
