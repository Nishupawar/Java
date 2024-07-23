public class FactorialNestedLoop{

    public static void main(String[] args) {
        for(int i=1;i<=20;i++){
int fact=1;
            for(int j=i;j>1;j--){
fact =fact*j;
            }
            System.out.println("First of Factorial "+ i + "is the :" + fact);
        }
    }
}