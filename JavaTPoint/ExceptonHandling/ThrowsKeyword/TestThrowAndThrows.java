package ExceptonHandling.ThrowsKeyword;

public class TestThrowAndThrows 
{
    static void method() throws ArithmeticException
    {
        System.out.println("Inside the method()");
        throw new ArithmeticException("throwing ArithmeticException");
    }

    public static void main(String[] args) 
    {
        try 
        {
            method();
        } 
        catch (ArithmeticException exception) 
        {
           System.out.println("caught by main() method");
        }
    }
}
