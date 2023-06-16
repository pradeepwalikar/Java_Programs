package AccessSpecifier.com.family.myfamily;

public class Father 
{
    private void atm()
    {
        System.out.println("Dad ATM");
    }

    void car()
    {
        System.out.println("Dad car");
    }

    protected void bike()
    {
        System.out.println("Dad bike");
    }

    public void cycle()
    {
        System.out.println("Dad cycle");
    }

    public static void main(String[] args)
    {
       Father father = new Father();
       father.atm();
       father.car();
       father.bike();
       father.cycle();

    }
}
