public class SpiralPattern {
    public static void main(String[] args)
    {
       int[][]a = new int[4][4];

    //     jmin     jmax
    //        0   1   2   3
   // imin 0  1   2   3    4
   //      1  12  13  14   5 
   //      2  11  16  15   6
   // imax 3  10  9   8    7
   
    int imin=0;
    int jmin=0;
    int imax=a.length-1;
    int jmax= a.length-1;
      int cnt=1;
      
      
      while(jmin<=jmax)
      {
    	//first row
    	    for(int j=jmin ; j<=jmax;j++)
    	    {
    	       a[imin][j]=cnt++;
    	    }
    	    imin++;
    	    
    	      //second row
    	    for(int i=imin ; i<=imax;i++)
    	    {
    	       a[i][jmax]=cnt++;
    	    }
    	   jmax--;
    	   
    	   //third row
    	    for(int j=jmax ; j>=jmin;j--)
    	    {
    	       a[imax][j]=cnt++;
    	    }
    	    imax--;
    	     
    	    //fourth row
    	    for(int i=imax ; i>=imin;i--)
    	    {
    	       a[i][jmin]=cnt++;
    	    }
    	    jmin++;

      }

   for (int i = 0; i < a.length; i++)
    {
       for (int j = 0; j < a.length; j++)
        {
           System.out.print(a[i][j]+" ");
       }
       System.out.println();
   }
   }

}
