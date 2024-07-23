public class Finger {
    public static void main(String[] args) {
        int num=15;
        int finger=0;
        int inceOrDec=0;//incr=0; Dec=1;
        for(int i=1;i<=num;i++)
        {
            if(inceOrDec==0)
            finger++;
            else
            finger--;

            if(finger==5)
            inceOrDec=1;

            if(finger==1)
            inceOrDec=0;
           // System.out.println(finger);
        }
        switch(finger)
        {
            case 1:
            System.out.println("Thumb");
            break;
             case 2:
            System.out.println("Index");
            break;
             case 3:
            System.out.println("Midddle");
            break;
             case 4:
            System.out.println("Ring");
            break;
             case 5:
            System.out.println("Litte");
            break;
             default:
             System.out.println("No value match!!");
        }

    }
}
