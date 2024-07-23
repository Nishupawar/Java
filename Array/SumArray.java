

public class SumArray {
public static void main(String[] args) {
	int[] a=  {12,45,45,67,55,88};
	double sum=0;
	double avg;
	
	for(int i=0;i<a.length;i++) 
	{
		sum= sum+a[i];
	}
	System.out.println(sum);
	avg=sum/a.length;
	System.out.println(avg);
}
}
