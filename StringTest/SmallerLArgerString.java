public class SmallerLArgerString {
    public static void main(String[] args) {
        String s1="Welcome to Java Progarmming ";
        String []split = s1.split(" ");
     
        for (int i = 0; i < split.length; i++) {
            for (int j = i+1; j < split.length; j++) {
                if(split[i].length()>split[j].length())
                {
                    String temp= split[i];
                    split[i]=split[j];
                    split[j]=temp;
                }
            }
        }
        System.out.println("Smallest Word : "+split[0]);
        System.out.println("Largest Word : "+split[split.length-1]);

    }
}
