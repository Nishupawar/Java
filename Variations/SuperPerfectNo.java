public class SuperPerfectNo {
    public static void main(String[] args) {
        int num=16;
        int sfnum=sumOfFact(num);
        int sfsfnum= sumOfFact(sfnum);
        if(sfsfnum==2*num)
            System.out.println("Super Perefect Number");
            else
                System.out.println("not super Perfect Number");
                
    }
    public static int sumOfFact(int num) {
        int sum=0;
        for(int i=1;i<=num;i++) {
            if(num%i==0)
                sum=sum+i;
        }
        return sum;
    }
}
