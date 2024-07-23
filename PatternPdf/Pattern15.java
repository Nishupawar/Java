//package PatternPdf;

public class Pattern15 {
        public static void main(String[] args) {
            int mid=1;   int end=5;
            for(int i=1;i<=9;i++)  {
                for(int j=1;j<=end;j++)     {
                    if(j<mid)
                    System.out.print(" ");
                    else
                    System.out.print("*");
                }
                if(i<5)      {
                    mid++;
                    end=5;
                }
                else    {
                    mid=5;
                    end++;
                }
                System.out.println();
            }
        }
        
    }
    
    
    // *****
    //  ****
    //   ***
    //    **
    //     *
    //     **
    //     ***
    //     ****
    //     *****

