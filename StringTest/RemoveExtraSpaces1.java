public class RemoveExtraSpaces1 {
    public static void main(String[] args) {
        String s1 = " hi  welcome   to       hefshine   ";
        
         s1=s1.trim();
         //System.out.println("Trim : "+s1);
        String s2="";
        int spaceCnt=0;
        for(int i=0;i<s1.length();i++)
        {
            
            if(s1.charAt(i)!=' ')
            {
                s2=s2+s1.charAt(i);
                spaceCnt=0;
            }
            else if(spaceCnt==0)
            {
                s2=s2+s1.charAt(i);
                spaceCnt++;
            }
        }
        System.out.println("Remove Extra Spaces : "+s2);
    }
}
