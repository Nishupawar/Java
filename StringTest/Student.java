//package StringTest;

public class Student {
    public static void main(String[] args) {
        String s1 = new String("Hefshine@123");
        System.out.println(s1);

        String s2 = "Hefshine@123";
        System.out.println(s2);

        char[] ch = { 'H', 'e', 'f', 's', 'h', 'i', 'n', 'e', '@', '1', '2', '3' };
        System.out.println(ch);

        String s = "Nishu";
        System.out.println(s);

        int strLen = s.length();
        System.out.println("String Length : " + strLen);

        char xh = s.charAt(1);
        System.out.println("Index letter : " + xh);

        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            System.out.println(ch1 + " " + i);
        }

        String str = "Nishigandha";
        char[] ch2 = str.toCharArray();
        System.out.println(ch2);
    }
}