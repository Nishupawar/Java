public class AmicableNo {
    
	//StartOfMainMethod
	public static void main(String[] args) {

		int x = 220, y = 284;
		int sumOfFact1=0;
		int sumOfFact2=0;
		for(int i=1;i<x;i++)
		{
			if(x%i==0)
			sumOfFact1= sumOfFact1+i;
		}
		for(int i=1;i<y;i++)
		{
			if(y%i==0)
			sumOfFact2=sumOfFact2+i;
		}
		if(sumOfFact2==x && sumOfFact1==y)
		System.out.println("Yes");
		else
		System.out.println("No");
	}
}

