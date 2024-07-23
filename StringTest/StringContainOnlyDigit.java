
public class StringContainOnlyDigit {
public static void main(String[] args) {
	String  s= "as123df";
	int cnt=0;
	for(int i=0;i<s.length();i++)
	{
		if(s.charAt(i)>'0' && s.charAt(i)<'9'){
		cnt++;
        }       
	}
	if(cnt==s.length())
		System.out.println("digit");
	else
		System.out.println("not  all digit");
}
}
