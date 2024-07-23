public class Pattern71 {
    public static void main(String[] args) {
        int mid=1;
        int end=1;
        for(int i=1;i<5;i++){
            int cnt=1;
            int cnt1 =cnt;
			for(int j=1;j<=end;j++){
                if(j<mid){
                System.out.print(cnt1);
                cnt1++;
            }
                else{
				System.out.print(cnt1);
                cnt1--;                 //1
                }                       //121
			}
            mid++;
            end=end+2;
			System.out.println();
		}
    }
}

//1
//121
//12321
//1234321