public class PerfectNo {
    public static void main(String[] args) {
        int sumOfFacct=0;
        int num=0;
        for (int i = 1; i <num; i++) 
        {
            if(num%i==0)
            sumOfFacct=sumOfFacct+i;
        }
        if(sumOfFacct==num)
        System.out.println("Perfect");
        else
        System.out.println("not Perfect");
    }
}
