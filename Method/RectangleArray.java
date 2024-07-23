package Method;

public class RectangleArray {
    public static void main(String[] args) {
	
        Rectangle [] rectArr= new Rectangle[3];
        
        Rectangle r1= new Rectangle(2,3);
        rectArr[0]=r1;
        
        r1= new Rectangle(3,4);
        rectArr[1]= r1;
        
        r1= new Rectangle(2,4);
        rectArr[2]= r1;
        
        double area;
        for(int i=0;i<rectArr.length;i++)
        {
            area =rectArr[i].area();
            System.out.println(rectArr[i]);
            System.out.println("area : "+area);
        }
    }
}
