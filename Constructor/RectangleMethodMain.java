public class RectangleMethodMain {
    public static void main(String[] args) {
      //  double perimeter;
        RectangleMethod r1= new RectangleMethod();
        r1.printData();
        r1.length=10.0;
        r1.breadth=5.0;
        r1.printData();
        System.out.println("Perimeter of r1 is "+r1.perimeter);

        RectangleMethod r2=  new RectangleMethod();
        r2.printData();
        System.out.println("Perimeter of r2 is "+r2.perimeter);
    }
}
