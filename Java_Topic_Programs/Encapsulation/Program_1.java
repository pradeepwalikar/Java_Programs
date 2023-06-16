package Encapsulation;

class Sample
{
    private int a = 100;

    public int getA()
    {
        return a;
    }

    public void setA(int a)
    {
        this.a=a;
    }
}

public class Program_1 
{
    public static void main(String[] args) 
    {
        Sample sample = new Sample();
        System.out.println(sample.getA());
        sample.setA(156);
        System.out.println(sample.getA());
    }
}
