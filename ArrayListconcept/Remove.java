package ArrayListconcept;

import java.util.ArrayList;

public class Remove {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(45);
        
        System.out.println("al : "+al);
        
        ArrayList<Integer> al2 = new ArrayList<>();
        al2.add(10);
        al2.add(60);
        al2.add(380);
        al2.add(45);
        
        al.removeAll(al2);
        System.out.println("Common remove : "+al);
        //remove All
    //	al.removeAll(al);
    //	System.out.println(al);
        
        al.remove(0);
        System.out.println(al);
        
        ArrayList<String> a = new ArrayList<>();
        a.add("aaa");
        a.add("bbb");
        a.add("ccc");
        
        System.out.println(a);
        a.remove(2);  //OR
        a.remove("ccc");
        System.out.println(a);
}
}
