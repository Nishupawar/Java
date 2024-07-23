public class RectangleMethod {
    public double length=0.0;
    public double breadth=0.0;

    public double perimeter(){
        double perimeter =2*length+2*breadth;
        return perimeter;
    }

    public void printData()
    {
        System.out.println("Length: "+length+ "Breadth: "+breadth);
    }
}
