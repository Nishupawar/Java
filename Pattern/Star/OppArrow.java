public class OppArrow {
   
        public static void main(String[] args) {
            int end=9;
            int start=5;
            for(int i=1;i<=9;i++)
            {
                for(int j=1;j<=start;j++)
            {
                System.out.print(" ");
            }
                for(int j=start;j<=end;j++)
                {
                    System.out.print("*");
                }
                if(i<5){
                start--;
                end--;
                }
                else{
                start++;
                end++;
                }
                System.out.println();  
        }
    }
    }
    
    
    
    //      *****
    //     *****
    //    *****
    //   *****
    //  *****
    //   *****
    //    *****
    //     *****
    //      *****
