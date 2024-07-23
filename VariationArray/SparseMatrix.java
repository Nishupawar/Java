package VariationArray;

public class SparseMatrix {
    public static void main(String[] args) {
        int a[][] = {     
                {4, 0, 0},  
                {0, 5, 0},  
                {0, 0, 6}  
            };  
        int size = a.length*a.length;
        int cnt=0;
        for (int i = 0; i < a.length; i++)
        {
          for (int j = 0; j < a.length; j++) {
              if(a[i][j]==0)
                  cnt++;
          }
      }
        if(cnt> (size/2))
              System.out.println("Given matrix is a sparse matrix");  
        else  
            System.out.println("Given matrix is not a sparse matrix");  
    }  
}
