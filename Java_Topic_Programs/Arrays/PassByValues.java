package Arrays;

public class PassByValues {
    static void add(int a, int b)
    {
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        add(10, 10);
    }
}
