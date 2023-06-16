package constructoroverloading;

class Sample
{
    Sample(int a)
    {
        System.out.println("Interger A = "+a);
    }

    Sample(String b)
    {
        this(56);
        System.out.println("String b = "+b);
    }

    Sample(double c)
    {
        this("java");
        System.out.println("Double c = "+c);
    }

    Sample(int d, String e)
    {
        this(56.369);
        System.out.println("Interger d = "+d+" and String e = "+e);
    }

    Sample(double f, String g)
    {
        this(20, "jsp");
        System.out.println("Double f = "+f+" and String g = "+g);
    }
}

public class This_Colling_Stmnt
{
    public static void main(String[] args) 
    {
        Sample sample = new Sample(20.36,"jsp");
    }
}
