public class PronicNumber{
    public static void main(String[] args) {
        int num=0;
        int diff=2;
        int cnt=0;
        int cnt1=14;
        while(cnt<15)
        {
          //  System.out.println(num);
            num= num+diff;
            diff=diff+2;
            cnt++;
            if(cnt==cnt1)
            System.out.println(num);
        }
    }
}