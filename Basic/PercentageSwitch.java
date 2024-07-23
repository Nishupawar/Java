import java.util.Scanner;
public class PercentageSwitch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Marks:");
  int marks= sc.nextInt();
  switch(marks/10){
    // fo >=90
    case 10:
    case 9:
   System.out.println("A");
    break; 
    // for >=80 and <90

    case 8:
   System.out.println("B");
    break;
    //for >=70 and <80

     case 7:
   System.out.println("C");
    break;
    //for >=60 and <70

     case 6:
   System.out.println("D");
    break;
    //for >=50 and <60

     case 5:
   System.out.println("E");
    break;
    //for <50

    default:
    System.out.println("Fail");
  }
    }
}
