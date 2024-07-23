public class NicomachuTheorem {
    public static void main(String[] args) {
        //  1= 1
        //  2= 8
        //  3 = 27
        //  4= 64
        //  5=125
        //  addition = 15 225
        //  15 srq == 225
        int n=5;
        int cubeNSum=0;
        int sumNSqr=0;
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            int cube=i*i*i;
            cubeNSum = cubeNSum+cube;
        }
        for(int i=1;i<=n;i++)
        {
             sum =sum+i;
        }
        sumNSqr= sum*sum;
        if(sumNSqr==cubeNSum)
        System.out.println("NicomachuTheorem");
        else
        System.out.println("not");
    }
}
/*//StartOfMainMethod
	public static void main(String[] args) 
	{
		int n = 5;
		myCode(n);
	}
	//EndOfMainMethod
	private static void myCode(int n)
	{
		NicomachuTheorem_sum(n);
	}
	static void NicomachuTheorem_sum(int n)
	{
		int sum = 0;
		for (int k = 1; k <= n; k++)
		sum += k * k * k;
		int triNo = n * (n + 1) / 2;
		if (sum == triNo * triNo)
		System.out.println("Yes");
		else
		System.out.println("No");
	}*/