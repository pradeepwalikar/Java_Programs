package Java_Topic_Programs.Inheritance;

class Multi1{
    int x=10;
}

class Multi2 extends Multi1{
    void disp()
    {
        System.out.println("Disp");
    }
}

class Multi3 extends Multi2{
    void cool()
    {
        System.out.println("Cool");
    }
}

public class Multi_Level {
    
    public static void main(String[] args) {
        
        Multi3 multi3 = new Multi3();
        System.out.println(multi3.x);
        multi3.disp();
        multi3.cool();
    }
}
