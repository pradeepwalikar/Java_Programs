package Java_Topic_Programs;

public class Composition {
    
    void add()
    {
        int a=10;
        int b=10;
        int c=a+b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        Composition composition = new Composition();
        composition.add();
    }
}
