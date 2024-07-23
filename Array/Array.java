import java.util.Scanner;
public class Array {
public static void main(String[] args) {
	int[]arr = new int[5];
	int len = arr.length;
	System.out.println("Array length: "+len);
	//iterating over array
	for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]+",");	
	//assign values
	arr[0]=10;
	arr[1]=20;
	arr[2]=30;
	arr[3]=40;
	arr[4]=50;
	System.out.println();
	for(int i=0;i<len;i++)
		System.out.print(arr[i]+",");
	System.out.println();
	
	char[] vowels = {'a','e','i','o','u'};
	for(int i=0;i<vowels.length;i++) {
		System.out.print(vowels[i]+",");
	}
	System.out.println();
	
	//read elements into an array in a loop using scanner
	Scanner sc = new Scanner(System.in);
	int[]iarr = new int[6];
	for(int i=0;i<iarr.length;i++) {
		System.out.println("Enter element "+i);
		iarr[i]= sc.nextInt();
	}
	
	//print element
	System.out.println("You Entered");
	for(int i=0;i<iarr.length;i++) {
		System.out.print(iarr[i]+",");
	}
	System.out.println();
}
}
