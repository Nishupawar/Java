public class Lcm {
    public static void main(String[] args) {
        int num1=12;
        int num2=15;
        for(int i=1 ; ; i++)
        {
            if(i%num1 == 0 && i%num2==0)
            {
                System.out.println(i);
                break;
            }
        }
    }
}
