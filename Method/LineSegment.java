package Method;

public class LineSegment {
    private Point2D p1;
    private Point2D p2;
    
    public LineSegment(Point2D p1,Point2D p2)
    {
        this.p1= p1;
        this.p2 =p2;
    }
   
   public Point2D getP1() {
       return p1;
   }
   
   
   @Override
   public String toString() {
       return "LineSegment [p1=" + p1 + ", p2=" + p2 + "]";
   }
   
   public Point2D getP2() {
       return p2;
   }
   
   
      
}
