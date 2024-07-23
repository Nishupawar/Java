package Method;

public class AccManager {
    String name;
    long accNo;
    double balance;

    public AccManager(String name, long accNo)
 	{
 		this(name,accNo,0.0);
 	}

	@Override
    public String toString() {
        return "AccManager [name=" + name +  ", accNo=" + accNo + ", balance=" + balance + "]";
    }

    public AccManager(String name, long accNo, double balance)
	{
		this.name = name;
		this.accNo = accNo;
		this.balance = balance;
	}
	
	public void displayData()
	{
		System.out.println("name : "+name +"accNo : "+accNo + "balance : "+balance);
	}
	
	public double depositAmount(double amount)
	{
		balance =balance+amount;
		return balance;
	}

    public double withdrawAmount(double amount)
	{
		if(balance>=amount)
		{
		balance=balance-amount;
		return amount;
	}
	return 0.0;
}

public double  checkBalance()
{
	return balance;
}
}
