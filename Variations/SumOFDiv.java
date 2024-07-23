public class SumOFDiv {
    public static void main(String[] args) {
        int num=20;
        int sum=0;
for(int i=1;i<num;i++)
{

    if(num%i==0){
    System.out.println("divisor : "+i);
    sum=sum+i;
    }
}
System.out.println(sum);
    }
}
