package OopsConcept;

public class AnimalMethod {
    String name;
    int age;

    void intObj(String a,int b)
    {
        name=a;
        age=b;
    }
     
    void display()
    {
        System.out.println(name+" "+age);
    }

    public static void main(String[] args) 
    {
        AnimalMethod am = new AnimalMethod();
        am.age=10;
        am.name="Dogg";
        am.intObj("Puppy", 15);
        am.display();
        
    }
}
