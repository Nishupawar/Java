public class ArrayDictoonary {
    public static void main(String[] args) {
        String s1="welcome to hefshine";
        //String s1 = "I live in Pune";
      String s2[] = s1.split(" ");
      for(int i=0;i<s2.length;i++)
      {
        for(int j=i+1;j<s2.length;j++)
        {
            if(s2[i].compareTo(s2[j])>0)
           {
                String temp=s2[i];
                s2[i]=s2[j];
                s2[j]=temp;
           }
        }
      }
      for(int i=0;i<s2.length;i++)
      {
        System.out.print(s2[i]+" ");
      }
    }
}
