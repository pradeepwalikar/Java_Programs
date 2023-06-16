package Java_Topic_Programs.Inheritance;

interface Multiple1{
    void disp();
}

class Multiple2 implements Multiple1{
    int x=10;

    public void disp()
    {
        System.out.println("Disp");
    }
}

class Multiple3 extends Multi2{

    void cool()
    {
        System.out.println("Cool");
    }
}

public class Multiple {

    public static void main(String[] args) {

        Multiple3 multiple3 = new Multiple3();
        System.out.println(multiple3.x);
        multiple3.disp();
        multiple3.cool();
    }
    
}
