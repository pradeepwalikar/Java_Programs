package Java_Topic_Programs.Inheritance;

class Common_Super_Class{
    int x=10;
}

class Hirarchical1 extends Common_Super_Class{
    void disp()
    {
        System.out.println("Disp");
    }
}

class Hirarchical2 extends Common_Super_Class{
    void cool()
    {
        System.out.println("Cool");
    }
}
public class Hirarchical {
    public static void main(String[] args) {
        
        System.out.println("Hirarchical1");
        Hirarchical1 hirarchical1 = new Hirarchical1();
        System.out.println(hirarchical1.x);
        hirarchical1.disp();

        System.out.println();

        System.out.println("Hirarchical2");
        Hirarchical2 hirarchical2 = new Hirarchical2();
        System.out.println(hirarchical2.x);
        hirarchical2.cool();
    }
}
