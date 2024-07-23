public class RepeatEveyWord {
    public static void main(String[] args)
     {

        	
		String s1 = "I am a good boy";
        String[] a= s1.split(" ");
        String s2="";
        for (int i = 0; i < a.length; i++) 
        {
            for(int j=a[i].length()-1;j>=0;j--)
            {
                s2=s2+a[i].charAt(j);
            }
            s2=s2+" ";
        }
        System.out.println(s2);
    //     //String s1="I live in pune";
    //   String s1 = "I am a good boy";
    //   String[] s2= s1.split(" ");
    //   for (int i = 0; i < s2.length; i++) {
    //     String temp=s2[i];
    //     char ca[]= temp.toCharArray();
    //     int start=0;
    //     int end= ca.length-1;

    //     while (start<end) {
    //         char ch = ca[start];
    //         ca[start]= ca[end];
    //         ca[end] =ch;

    //         start++;
    //         end--;
    //     }

    //     String s4 =new String(ca);
    //     s2[i]=s4;
    // }
    //     String str="";
    //     for (int j = 0; j < s2.length; j++) {
    //         str +=s2[j]+" ";
    //     }
    //     System.out.print(str+" ");
      
    }
}
