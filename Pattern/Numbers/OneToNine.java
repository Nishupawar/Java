public class OneToNine {
    public static void main(String[] args) {
         int cnt=1;
        for(int i=1;i<=9;i++)
        {
          
            for(int j=1;j<=i;j++)
            {
                System.out.print(cnt);
                
               // System.out.print(cnt);
              //  cnt++;
            }
            cnt++;
            System.out.println();
        }
    }
    
}


// 1
// 22
// 333
// 4444
// 55555
// 666666
// 7777777
// 88888888
// 999999999