import java.util.Scanner;
public class ElectricityBillIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter unit :");
       int units=sc.nextInt();
    //  int  unit=78;
        double bill=0;
		if(units<=50)
		bill= units*0.50;
		else if(units <=150)
		bill= (50*0.50)+(units-50)*0.75;
		else if(units<=250)
		bill= (50*0.50)+(100*0.75)+(units-150)*1.20;
		else
		bill= (50*0.50)+(100*0.75)+(100*1.20)+(units-250)*1.50;

        //System.out.println("Electricity Bill : " + bill);
        //System.out.println("Electricity Bill of 20 % is : "+(bill *1.20));
		System.out.println(bill*1.20);
/* 
        if(unit<=50)
		bill= unit*0.50;
	else if(unit<=150)
		bill= (50*0.50)+(unit-50)*0.75;
	else if(unit<=250)
		bill=(50*0.50)+(100*0.75)+(unit-150)*1.20;
	else
		bill=(50*0.50)+(100*0.75)+(100*1.20)+(unit-250)*1.50;
        */
    }
}
