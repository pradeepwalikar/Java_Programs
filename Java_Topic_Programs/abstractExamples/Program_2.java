package abstractExamples;

abstract class Animals
{
    abstract void goat();
    abstract void cow();
}

abstract class Market_1 extends Animals
{
    void goat()
    {
        System.out.println("This is goat");
    }
}

class Market_2 extends Market_1
{
    void cow()
    {
        System.out.println("This is cow");
    }
}

public class Program_2 
{
    public static void main(String[] args)
    {
        Market_2 market_2 = new Market_2();
        market_2.goat();
        market_2.cow();
    }
}
