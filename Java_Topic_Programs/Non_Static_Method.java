package Java_Topic_Programs;

public class Non_Static_Method {
    
    int a = 10;

    void add()
    {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Non_Static_Method method = new Non_Static_Method();
        System.out.println(method.a);
        method.add();

    }
}
