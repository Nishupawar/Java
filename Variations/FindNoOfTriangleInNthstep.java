public class FindNoOfTriangleInNthstep {
public static void main(String[] args) {
    int ot=1;
    int div=1;
    for(int i=0;i<5;i++)
    {
        div= (div-(div/4))*4;
        int ans = ot+div;
        ot=ans;
        System.out.println(ans);

    }
}
}
