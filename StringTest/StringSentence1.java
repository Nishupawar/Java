public class StringSentence1 {
    public static void main(String[] args) {
        String s= "You all are very very very good students";
    //  students good very very very are all You 
        
        String[] s1= s.split(" ");
        String s2="";
      
        for(int i=s1.length-1;i>=0;i--)
        {
            s2= s2+" "+s1[i];
            
        }
        System.out.println(s2);
        
        
    }
}
