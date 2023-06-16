package Arrays;

class Bank
{
    void money()
    {
        System.out.println("Money");
    }
}

class Dinga
{
    static void needmoney(Bank bank)
    {
        bank.money();
    }
}

class Dingi
{
    static void needmoney(Bank bank)
    {
        bank.money();
    }
}

public class PhonePay 
{
    public static void main(String[] args)
     {
        Bank bank = new Bank();
        Dinga.needmoney(bank);
        Dingi.needmoney(bank);
    }
}
