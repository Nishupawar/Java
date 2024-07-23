package ExceptionConcept;

public class UserRegistration {
    
    void register(int age)
    {
        if(age < 18)
        {
            try 
            {
                throw new InvalidAgeException("user is minor");

            }
             catch (InvalidAgeException e) {
                System.out.println("catched");
                System.out.println(e.getMessage());
            }
        }
        else
        {
            System.out.println("eligible for voting...");
            System.out.println("You will be notified for next step");
        }

    }
}
