public class StringSentence {
    public static void main(String[] args) {
       
            //String s= "You all are very very very good students";
            String s= "Nishigandha Vijay Pawar";
            String s1= "";
            String s2= "";
            String s3= "";
            String[] a= s.split(" ");
            
        //    Write a program to reverse every word in a string usingmethods.
        //    {i/p: You all are very very very good students
        //   o/p1: students good very very very are all you
        //   o/p2: uoY lla era yrev yrev yrev doog stneduts
        //    o/p3: stneduts doog yrev yrev yrev era lla uoY}
          
            for(int i=a.length-1;i>=0;i--)
            {
              s1=s1+" "+a[i];
            }
            System.out.println(s1);
            //students good very very very are all You
        
            
            for(int i=0;i<a.length;i++)
            {
                for(int j=a[i].length()-1;j>=0;j--)
                {
                    s2=s2+a[i].charAt(j);
                }
                s2= s2+" ";
            }
            System.out.println(s2);
            //uoY lla era yrev yrev yrev doog stneduts 
        
            
            
            for(int i=a.length-1;i>=0;i--)
            {
                for(int j=a[i].length()-1;j>=0;j--)
                {
                    s3=s3+a[i].charAt(j);
                    }
                s3=s3+" ";
            }
            System.out.println(s3);
            //stneduts doog yrev yrev yrev era lla uoY    
            
        }
    }
