public class EleIndex {
    public static void main(String[] args) {
        int []a ={1,2,3,4,5,6,1,8,9,1};
        int cnt=0;
        int ele=1;
        for (int i = 0; i < a.length; i++) {
            if(a[i]==ele)
            {
                System.out.println("element at index "+i);
                cnt++;
            }
        }
        if(cnt==0)
        System.out.println("not found");
    }
}
