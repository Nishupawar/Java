public class MethodDemo {
    public static void method1()
    {
        System.out.println("no parameter no return type");
    }

    public static void method2(int a,int b)
    {
        System.out.println("Parameter and no return type");
        System.out.println(a+b);
    }

    public static int method3(int a,int b)
    {
        System.out.println("Parameter and return type");
        return a+b;
    }
    public static String method4()
    {
        System.out.println("Parameter and return type");
        return "Hello";
    }

    public static int largest(int a, int b)
    {
        if(a>b)
        return a;
        else
        return b;
    }

    public static int largest(int a,int b,int c)
    {
        if(a>b && a>c)
        return a;
        else if(b>a && b>c)
        return b;
        else
        return c;
    }
    public static void main(String[] args) {
        method1();
        method1();
        method1();
        method2(10, 20);
        int v1=10;
        int v2=30;
        method2(v1, v2);
        String s= method4();
        System.out.println("String is "+s);
        String s1= "abcd";
        int large = largest(20, 30);
        System.out.println("Largest of 2 nums is "+large);
        System.out.println("Largest of 3 nums is "+largest(10, 30, 40));
    }
}
