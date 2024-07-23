package VariationsArrayList;

import java.util.ArrayList;
import java.util.List;

public class CopyOneArrayListIntoSecond {
    public static void main(String[] args) {
        List<String> List1 = new ArrayList<String>();
        List1.add("1");
        List1.add("2");
        List1.add("3");
        List1.add("4");
        List<String> List2 = new ArrayList<String>();
        List2.add("A");
        List2.add("B");
        List2.add("C");
        List2.add("D");

        List1.clear();
        List1.addAll(List2);
        System.out.println("List1 : "+List1);
        System.out.println("List2 : "+List2);
    }
}
