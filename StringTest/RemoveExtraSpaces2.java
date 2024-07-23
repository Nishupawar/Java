public class RemoveExtraSpaces2 {
    public static void main(String[] args) {
        String s1="   hi    welcome  to  hefshine    ";
        
        
        String[] sa= s1.split(" ");
        String s2="";
        for(int i=0;i<sa.length;i++)
        {
            if(sa[i].length()>=1)
                s2=s2+sa[i]+" ";
        }
        System.out.println(s2);
    }
}
