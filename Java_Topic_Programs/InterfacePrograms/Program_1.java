package InterfacePrograms;

abstract interface Products
{
    public abstract void puma();
    public abstract void adidas();
    public abstract void lives();
    public abstract void hrx();
}

class Jsp_Show_Room implements Products
{
   public void puma()
    {
        System.out.println("Puma Shoes");
    }

    public void adidas()
    {
        System.out.println("Adidas T-shirt");
    }

    public void lives()
    {
        System.out.println("Live's jacket");
    }

    public void hrx()
    {
        System.out.println("HRX Bag");
    }
}

public class Program_1 
{
    public static void main(String[] args) 
    {
        Jsp_Show_Room jsp_Show_Room = new Jsp_Show_Room();
        jsp_Show_Room.puma();
        jsp_Show_Room.adidas();
        jsp_Show_Room.lives();
        jsp_Show_Room.hrx();
    }
}
