import java.util.*;
public class HashPractice {
    public static void main(String[] args) {
        HashMap<Integer,String> hm= new HashMap<>();
        hm.put(1, "abc");
        hm.put(2, "xyz");
        
        System.out.println(hm);
        
        Set<Integer> key= hm.keySet();
        System.out.println(key);
        
        Collection<String> values = hm.values();
        System.out.println(values);
    }
}
