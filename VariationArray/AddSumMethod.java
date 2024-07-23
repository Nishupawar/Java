package VariationArray;

public class AddSumMethod {
    public static void main(String[] args) {
        int num1= 20;
        int num2=10;
        int a[]= add(num1,num2);
        System.out.println("Addition : "+a[0]);
        System.out.println("Substraction : "+a[1]);
        
    }
    public static int[] add(int num1, int num2)
    {
    int add= num1+num2;
    int sub= num1-num2;
    
    int[] a= new int[2];
    
    a[0]=add;
    a[1]=sub;
    return a;
    }
}
