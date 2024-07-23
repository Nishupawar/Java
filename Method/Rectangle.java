package Method;

public class Rectangle {
    public  double length;
 public double breadth;
 
 public Rectangle(double length,double breadth)
 {
	 this.length= length;
	 this.breadth= breadth;
 }
 
 public double perimeter()
 {
	 double perimeter= 2*(length+breadth);
	 return perimeter;
 }
 
 public double area() {
	 double area = length*breadth;
	 return area;
 }

@Override
public String toString() {
	return "Rectangle [length=" + length + ", breadth=" + breadth + "]";
}
}
