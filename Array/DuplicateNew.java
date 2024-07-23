public class DuplicateNew {
    public static void main(String[] args) {
      
        int [] a={11,22,33,44,33,55,22,11,66};
          int newcnt=0;
        for (int i = 0; i < a.length; i++) {
            int cnt=0;
            for (int j = 0; j < i; j++) {
                if(a[i]==a[j])
                cnt++;
            }
            //System.out.println("count : "+cnt);
            if(cnt==0)
            {
                System.out.print(a[i]+" ");
                newcnt++;
            }
        }
        System.out.println("new length of array : "+newcnt);
    }
}
