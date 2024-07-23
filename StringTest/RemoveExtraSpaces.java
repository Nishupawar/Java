public class RemoveExtraSpaces {
    public static void main(String[] args) {
        String s1 = " hi  welcome   to       hefshine   ";
        s1=s1.trim();
        System.out.println("Trim : "+s1);

        String s2= "";
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)==' ' && s1.charAt(i+1)==' ')
            {
                continue;
            }
            else
            {
                s2=s2+s1.charAt(i);
            }
        }
        System.out.println("Remove Extra Spaces : "+s2);
    }
}
