package Method;

public class LineSegmentMain {
    public static void main(String[] args) {
        Point2D  p1 = new Point2D(1,3);
        Point2D  p2 = new Point2D(3,5);
        LineSegment ls= new LineSegment(p1,p2);
        System.out.println(ls);
        
    }
}
