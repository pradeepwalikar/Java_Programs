package ExceptonHandling.EH_Method_Overriding;

import java.io.IOException;

class Parent
{
    void msg() 
    {
        System.out.println("parent method");
    }
}

public class TestExceptionChild extends Parent
{
    void msg() throws IOException
    {
        System.out.println("Test Exception Child");
    }

    public static void main(String[] args)
    {
        Parent parent = new TestExceptionChild();
        parent.msg();
    }
}
