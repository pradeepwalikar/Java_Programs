package typecasting;

public class Primitive 
{
    public static void main(String[] args) 
    {
        System.out.println("widening");
        double d = 20;//widening implicitly
        System.out.println(d);

        double e = (double) 20;//widening explicitly
        System.out.println(e);

        System.out.println("narroving");
        int i = (int)20.36;//narroving explicitly
        System.out.println(i);

    }
}
