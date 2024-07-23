import java.math.BigInteger;

public class Fact35 {
    public static void main(String[] args) {
	int num=35;
	BigInteger ans = findFact(num);
	System.out.println(ans);
}

private static BigInteger findFact(int num) {
	BigInteger fact= BigInteger.valueOf(1);
	while(num>0)
	{
		fact=fact.multiply(BigInteger.valueOf(num));
		num--;
	}
	return fact;
}


}
