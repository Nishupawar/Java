package Method;

public class AccManagerMain {
    public static void main(String[] args) {
	AccManager  acc = new AccManager("Nishu",96739699585L);
	acc.displayData();
	//System.out.println(acc);
	
	AccManager  acc1 = new AccManager("NishuPawar",96739234565L,1000.0);
	acc1.displayData();
	acc1.depositAmount(200.0);
	
	double balance = acc1.checkBalance();
	System.out.println("Balance is :  "+balance);
	
	double amount = acc1.withdrawAmount(500);
	System.out.println("Amount Withdrawn : "+amount);
	
	amount =acc1.checkBalance();
	System.out.println("Remaining balance : "+amount);
}
}