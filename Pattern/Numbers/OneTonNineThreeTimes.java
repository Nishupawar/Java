public class OneTonNineThreeTimes {
 public static void main(String[] args) {
    
    for(int i=1;i<=5;i++)
    {
        int cnt=0;
        for(int j=1;j<=10;j++)
        {
           for(int k=1;k<=3;k++)
           {
            System.out.print(cnt);
           }
           cnt++;
        }
        System.out.println();
    }
 }   
}


// 000111222333444555666777888999
// 000111222333444555666777888999
// 000111222333444555666777888999
// 000111222333444555666777888999
// 000111222333444555666777888999