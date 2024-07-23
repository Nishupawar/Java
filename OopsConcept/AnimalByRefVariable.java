package OopsConcept;

public class AnimalByRefVariable {
    String run;
    int dog;
    public static void main(String[] args) {
        AnimalByRefVariable a = new AnimalByRefVariable();
        a.dog=20;
        a.run="I am running";
        System.out.println(a.run+" "+a.dog+" "+a.run);
    }
}
