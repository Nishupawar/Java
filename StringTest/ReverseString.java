public class ReverseString {
    public static void main(String[] args) {
       // String s="I live in pune";
        String s = "I am a good boy";
        String s1[] =s.split(" ");
        
        // for (int i = 0; i < split.length; i++) {
        //     System.out.println(i+"  "+split[i]);
        // }

        for (int i = 0; i < s1.length; i++) {
            for (int j = i+1; j < s1.length; j++) 
            {
                    String temp=s1[i];
                    s1[i]=s1[j];
                    s1[j]=temp;
                
            }  
        }
        for(int i=0;i<s1.length;i++) {
            System.out.print(s1[i]+" ");
        }
    }
}
