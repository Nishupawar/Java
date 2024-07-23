public class DuplicateRemove {
    public static void main(String[] args) {
        int [] a={11,22,33,44,33,55,22,11};
        for (int i = 0; i < a.length; i++) {
            int cnt=0;
            for (int j = 0; j < i; j++) {
                if(a[i]==a[j])
                cnt++;
            }
       
             if(cnt==0) // 11 22 33 44 55
              System.out.print(a[i]+ " ");
            //  //System.out.println("Duplicate Remove  Element : "+a[i]);        
        }
    }
}
