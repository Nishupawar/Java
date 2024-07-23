public class EnhancedForLoop {
    public static void main(String[] args) {
        int[][] arr= new int[2][3];

        arr[0][0]=11;
        arr[0][1]=12;
        arr[0][2]=13;
        arr[1][0]=14;
        arr[1][1]=15;
        arr[1][2]=16;
                System.out.println("Print elements using enhanced for loop");
                for(int[] row: arr)
                {
                    for(int ele :row)
                    System.out.print(ele+",");
                    System.out.println();
                }

    }
}
