package method_over_loading;

public class MainMethod 
{
    public static void main(String[] args) 
    {
        System.out.println("Hello");
        main(10);
        main("hello");
    }

    public static void main(int a) 
    {
        System.out.println("Integer "+a);
    }

    public static void main(String b) 
    {
        System.out.println("String "+b);
    }
}
