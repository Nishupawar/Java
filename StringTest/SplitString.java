public class SplitString {
    public static void main(String[] args) {
        String s1="Welcome to hefshine";
      //  String s1 = "I live in Pune";
        String s2[] =s1.split(" ");
        
        // for (int i = 0; i < split.length; i++) {
        //     System.out.println(i+"  "+split[i]);
        // }

        for (int i = 0; i < s2.length; i++) {
            for (int j = i+1; j < s2.length; j++) {
                if(s2[i].length()>s2[j].length()){
                    String temp=s2[i];
                    s2[i]=s2[j];
                    s2[j]=temp;
                }
            }  
        }
        for(int i=0;i<s2.length;i++) {
            System.out.println(i+" "+s2[i]);
        }
    }
}
