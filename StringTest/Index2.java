

public class Index2 {
public static void main(String[] args) {
	String s1="hefshinehefshinehefshinehefshinehefshine";
	String s2="shine";

	
	int isEleFound=-1;
	for(int i=0;i<s1.length()-s2.length();i++)
	{
		if(s2.charAt(0)==s1.charAt(i))
		{
			int s1Index=i;
			int cnt=0;
			for(int j=0;j<s2.length();j++)
			{
				if(s2.charAt(j)==s1.charAt(s1Index))
					cnt++;
				s1Index++;
			}
			if(cnt==s2.length())
			{
				isEleFound++;
				System.out.println(i);
			}
		}
	}
}
}
