public class Transpose {
    public static void main(String[] args) {
        int [][]a={{1,2,3},{4,5,6},{7,8,9}};
        int [][] b= new int[a.length][a.length];
        
        for (int i = 0; i < a.length; i++)  {
            for (int j = 0; j < b.length; j++) {
                b[j][i]=a[i][j];
            }
        }
        System.out.println("A matrix : ");
    for(int i=0;i< a.length;i++)
    { for (int j = 0; j < b.length; j++) {
        System.out.print(a[i][j]+" ");
    }
    System.out.println();
    }
        System.out.println("Transpose : ");
   for (int j = 0; j < a.length; j++) {
    for (int j2 = 0; j2 < b.length; j2++) {
        System.out.print(b[j][j2]+" ");
    }
    System.out.println();
   }
    }
}
