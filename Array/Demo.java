import java.util.Scanner;

public class Demo {
  public static void main(String[] args) {
    int width = 4, height = width * 2;
	        int min = Math.min(width, height);
	        int area = width * height - 22 / 7 * min / 2 * min / 2;
	        System.out.print("area = " + area);
		
  }
}
