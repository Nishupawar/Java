//package PatternPdf;

public class Pattern19 {   
        public static void main(String[] args) {
            int end=5; 
             int mid=4;
            for(int i=1;i<=9;i++)   {
                for(int j=1;j<=end;j++)     {
                    if(j<=mid)
                    System.out.print(" ");
                    else
                    System.out.print("*");
                }
                if(i<5)   {
                    end++;
                    mid--;
                }
                else      {
                    end--;
                    mid++;
                }
                System.out.println();
            }
        }
    }
    
    
    //     *
    //    ***
    //   *****
    //  *******
    // *********
    //  *******
    //   *****
    //    ***
    //     *

