package CollectionConcept;

import java.util.ArrayList;
import java.util.Collections;

public class StudentMain {
    public static void main(String[] args) {
	Student s1= new Student(1,"abc",56);
	Student s2= new Student(2,"abc",46);
	Student s3= new Student(3,"abc",64);
	Student s4= new Student(4,"abc",57);
	
	ArrayList<Student> al = new ArrayList<>();
	al.add(s1);
	al.add(s2);
	al.add(s3);
	al.add(s4);
	
	System.out.println(al);
	Collections.sort(al);
	
	System.out.println(al);
	
//	for(int i=0;i<al.size();i++)
//	{
//		for(int j=i+1;j<al.size();j++)
//		{
//			if(al.get(i).marks>al.get(j).marks)
//			{
//				Student temp = al.get(i);
//				al.set(i, al.get(j));
//				al.set(j, temp);
//			}
//		}
//	}
//	System.out.println(al);

}
}
