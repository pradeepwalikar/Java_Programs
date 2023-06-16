package typecasting;

class Tester
{
    int y=10;
}

class Cool
{
    void cool()
    {
        System.out.println("I am Cool");
    }
}

public class ClassType 
{
    public static void main(String[] args)
    {
        Tester tester = new Cool();
        System.out.println(tester.y);
    }
}
