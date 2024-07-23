

public class NumberOfDigitCount {
public static void main(String[] args) {
	int num=736476958;
	int cnt=0;
		while(num>0) 
		{
			cnt++;
			num=num/10;	
		}
		System.out.println("count of digit : "+cnt);
 }
}
