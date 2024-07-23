public class StringSentence2 {
    public static void main(String[] args) {
        String s1="You all are very very very good students";
        //uoY lla era yrev yrev yrev doog stneduts 
        String[] sa=s1.split(" ");
        String mainAns="";
        
        for(int i=0;i<sa.length;i++)
        {
            String temp=sa[i];
            String rev ="";
            for(int j=temp.length()-1;j>=0;j--)
            {
                rev = rev+temp.charAt(j);
            }
            mainAns= mainAns+rev+" ";
        }
        System.out.println(mainAns);
    }
}
