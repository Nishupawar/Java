import java.util.Formatter;

public class Demo1 {
    public static void main(String[] args) {
       
		//CoS.2.1
		int start=3;
		int end=10;
		
		
	int sum = 0;

        for(int i = start; i <= end; i+=2 )
        {
            if( i == 8 )
            	break;

            sum += i;
        }

        System.out.println("sum = " + sum);
	}
        }