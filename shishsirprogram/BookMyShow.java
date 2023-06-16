package shishsirprogram;

class Theter
{
    void ticket()
    {
        System.out.println("Ticket");
    }
}

public class BookMyShow 
{
     static void main(String[] args) 
    {
        Theter theter = new Theter();
        Person1.b_ticket(theter);
    }
}

class Person1
{
    public static void b_ticket(Theter theter)
    {
        theter.ticket();
    }
}
