import java.util.Scanner;
public class VowelConsonant{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		System.out.println("Vowel_Constant");
		char ch=sc.next().charAt(0);
		
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'|| ch=='I'||ch=='O'||ch=='U')
		System.out.println("vowel");
		else
		System.out.println("consonant");
	}
}