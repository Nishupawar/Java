public class TwoDimentionalArray {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        arr[0][0]=11;
        arr[0][1]=21;
        arr[0][2]=31;
        arr[1][0]=41;
        arr[1][1]=51;
        arr[1][2]=61;


        System.out.println("element at row 0,column 2 is "+arr[0][2]);
        System.out.println("element at row 1, column 2 is "+arr[1][2]);

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr[i][j]+",");
                System.out.println();
            }

        }
            System.out.println("print elements using arr.length");
            for(int i=0;i<arr.length;i++)
            {
                for(int j=0;j<arr[i].length;j++)
                {
                    System.out.print(arr[i][j]+",");
                }
                   System.out.println();
                
            }

            int[][] arr1= {{1,2,3},{4,5,6}};
            System.out.println(arr1);
        }
    }

