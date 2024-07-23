public class PerfectNo {
    public static void main(String[] args) {
        int num=100;
        int cnt=0;
		for(int i=1;i<=num;i++)
		{
			if(num==i*i)
			cnt++;
		}
		if(cnt==1)
		System.out.println("perfect square");
		else
		System.out.println(" not perfect square");
	}
    }

