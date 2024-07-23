import java.util.ArrayList;

public class Compare {
    public static void main(String[] args) 
	{
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(4);
		list1.add(6);
		list1.add(3);
		list1.add(9);
		list1.add(7);
		
		ArrayList<Integer> list2=new ArrayList<Integer>();
		list2.add(4);
		list2.add(6);
		list2.add(12);
		list2.add(9);
		list2.add(7);
		
		
		
	
	Boolean a=list1.equals(list2);
System.out.print(a);	
}
}
