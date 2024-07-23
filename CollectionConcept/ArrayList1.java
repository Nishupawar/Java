package CollectionConcept;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList <Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        
        Object [] array= al.toArray();
        System.out.println(Arrays.toString(array));
        
        int size = al.size();
        System.out.println(size);
        
        al.set(1, 100);
        System.out.println(al);
        
        al.remove(1);
        System.out.println(al);
        
        int lastIndex =al.lastIndexOf(20);
        System.out.println(lastIndex);
        
        boolean isEmpty = al.isEmpty();
        System.out.println(isEmpty);
        
        int res= al.get(2);
        System.out.println(res);

        int index = al.indexOf(20);
        System.out.println(index);

        ArrayList<Integer> a12= new ArrayList<>();
        a12.add(10);
        a12.add(20);
        a12.add(30);
        
        System.out.println(a12);

        boolean isequal = al.equals(a12);
        System.out.println(isequal);

        boolean isContains = al.contains(20);
        System.out.println(isContains);

       // al.clear();
      //  System.out.println(al);

        al.add(1, 100);
        System.out.println(al);

     
        al.add(10);
        System.out.println(al);
}
}