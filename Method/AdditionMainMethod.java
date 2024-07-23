package Method;

public class AdditionMainMethod {
    public static void main(String[] args) {
        AdditionDemo ad = new AdditionDemo();
	ad.a=40;
	ad.b=20;
	int result;

	result= ad.addition();
	System.out.println("Addition : "+result);
	
	
	result= ad.substraction();
	System.out.println("substraction : "+result);
	
	result= ad.multiplication();
	System.out.println("multiplication : "+result);
	
	result= ad.division();
	System.out.println("division : "+result);
    }
}
