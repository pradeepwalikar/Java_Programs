package ExceptonHandling.ThrowException;

public class TestThrow1 {
    
    public static void validate(int age)
    {
        if (age < 18) 
        {
            throw new ArithmeticException("Person is not elgible to vote");
        } else {
            System.out.println("Person is elgible to vote");
        }
    }

    public static void main(String[] args) {
        validate(49);
        System.out.println("rest of the code");
    }
}
