package ExceptonHandling.JavaMultiCatchBlock;

public class MultipleCatchBlock1 {
    public static void main(String[] args) {
        
        try
        {
            int a[] = new int[5];
        a[5]=30/0;
        }
        catch(ArithmeticException arithmeticException)
        {
            System.out.println("Arithmetic Exception occurs");
        }
        catch(ArrayIndexOutOfBoundsException boundsException)
        {
            System.out.println("ArrayIndexOutOfBoundsException occurs");
        }
        catch(Exception exception)
        {
            System.out.println("Parent Exception occurs");
        }

        System.out.println("Rest of the code");
    }
}
