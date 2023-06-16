package Blocks;

public class Sample {
    static{
        System.out.println("SIB");
    }

    {
        System.out.println("IIB");
    }

    Sample()
    {
        System.out.println("Hey i am Constructor");
    }
    public static void main(String[] args) {
        System.out.println("main starts");
        Sample sample = new Sample();
        System.out.println("main Ends");
    }
}
