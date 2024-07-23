package VariationArray;

public class StringWithNumbersAtEnd {
    public static void main(String[] args) {
        String s= "geeks";
        char ch=' ';
        int cnt=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='0' && s.charAt(i)<='9')
                ch=s.charAt(i);
            if((s.charAt(i)>='a'&& s.charAt(i)<='z')||
                    (s.charAt(i)>='A' && s.charAt(i)<='Z'));
            cnt++;
        }
        int c=(int)ch-48;
        if(cnt==c)
            System.out.println(1);
        else
            System.out.println(0);
    }
}
