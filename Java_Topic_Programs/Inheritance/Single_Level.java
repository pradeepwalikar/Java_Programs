package Java_Topic_Programs.Inheritance;

class Single1{
    int x=10;
}

class Single2 extends Single1{

    void disp()
    {
        System.out.println("Disp");
    }
}
public class Single_Level {
   
    public static void main(String[] args) {
        Single2 single2 = new Single2();
        System.out.println(single2.x);
        single2.disp();
    }
}
