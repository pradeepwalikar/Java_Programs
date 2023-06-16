package polymorsphism.runtime;

class Electronics
{
    void products()
    {
        System.out.println("View Products");
    }
}

class Mobile extends Electronics
{
    void products()
    {
        System.out.println("Mobile phones");
    }
}

class Computer extends Electronics
{
    void products()
    {
        System.out.println("Laptop computer");
    }
}

class Television extends Electronics
{
    void products()
    {
        System.out.println("LED Television");
    }
}

class Watch extends Electronics
{
    void products()
    {
        System.out.println("Smart Watch");
    }
}

class Stimulator_1
{
    static void ansim(Electronics electronics)
    {
        electronics.products();
    }
}

public class Program_2 
{
    public static void main(String[] args) 
    {
        Mobile mobile = new Mobile();
        Computer computer = new Computer();
        Television television = new Television();
        Watch watch = new Watch();
        
        Stimulator_1.ansim(mobile);
        Stimulator_1.ansim(computer);
        Stimulator_1.ansim(television);
        Stimulator_1.ansim(watch);
    }
}
