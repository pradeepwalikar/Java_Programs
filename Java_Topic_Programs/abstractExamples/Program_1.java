package abstractExamples;

abstract class Demo
{
    abstract void disp();
    abstract void cool();
}

class Test extends Demo 
{
    void disp()
    {
        System.out.println("This is disp");
    }

    void cool()
    {
        System.out.println("This is cool");
    }
}

public class Program_1 
{
    public static void main(String[] args) 
    {
        Test test = new Test();
        test.cool();
        test.disp();
    }
}
