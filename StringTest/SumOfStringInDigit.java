public class SumOfStringInDigit {
    public static void main(String[] args) {
        String s1="fgq233";
        int sum=0;
        for (int i = 0; i < s1.length(); i++) {
            if(s1.charAt(i)>'0' && s1.charAt(i)<'9')
            {
                //int num= Character.getNumericValue(a.charAt(i));
               // int num= Character.getNumericValue(a.charAt(i));
              //  sum= sum+num;
              sum=sum+(s1.charAt(i)-48);
            }
        }
        System.out.println(sum);
    
    }
}
