public class FindFrequencyOfCharacter {
    public static void main(String[] args) {
        String s1="aabbccddadcb";
        for (int i = 0; i < s1.length(); i++) {
            int cnt=0;
            for (int j = 0; j < i; j++) {
                if(s1.charAt(i)==s1.charAt(j))
                {
                    cnt++;
                    break;
                }
            }
            if(cnt==0)
            { 
                int count=0;
               for (int j = 0; j < s1.length(); j++) {
                       if(s1.charAt(i)==s1.charAt(j))
                       count++; 
               }
               System.out.println(s1.charAt(i)+" "+count);
            }
        }
    }
}
