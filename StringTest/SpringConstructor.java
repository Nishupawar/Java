public class SpringConstructor {
    public static void main(String[] args) {
        char[] ch= new char[]{'a','b','c'};
        String s = new String(ch);
        System.out.println(s);

        byte[] b = {101,102,103};
       String s1 = new String(b);
        System.out.println(s1);

        char[] c= new char[]{'a','b','c'};
         String s2 = new String("abc");
         System.out.println("c :-"+c);
         System.out.println("s2 :-"+s2);
    }
}
