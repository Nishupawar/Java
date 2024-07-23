package OopsConcept;

public class Animal {
    public void eat()
    {
        System.out.println("I am eating");
    }
    public static void main(String[] args) 
    {
        System.out.println("Animal Program");
        Animal a= new Animal();
        a.eat();
        a.bark();
        a.run();
          
        System.out.println();

        Animal aa= new Animal();
        aa.bark();
        a.eat();
        a.run();

        System.out.println();

        Bird b= new Bird();
        b.fly();
        b.play();
    }
    public void run()
    {
        System.out.println("I am running");
    }

    public void bark()
    {
        System.out.println("I am barking");
    }
}

class Bird
{
    void fly()
    {
        System.out.println("I am flying");
    }

    void play()
    {
        System.out.println("Birds are playing");
    }
}
