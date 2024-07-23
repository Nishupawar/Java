public class MethodOverloadingDemo {
    void show(int a,String b)
 {
	 System.out.println("First");
 }
 void show(String b,int a)
 {
	 System.out.println("Second");
 }
 void show(int... c)
 {
	 System.out.println("Third");
 }
 
 public static void main(String[] args) {
	MethodOverloadingDemo  m=  new MethodOverloadingDemo();
	m.show(12,"abc");
	m.show("aaa", 10);
	m.show(12,23,45,7,8);
}

}
