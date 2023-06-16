package ExceptonHandling.ThrowsKeyword;

import java.io.IOException;

public class Testthrows1 {
    
    void m() throws IOException
    {
        throw new IOException("device error");
    }

    void n() throws IOException
    {
        m();
    }

    void p()
    {
        try {
            n();
        } catch (Exception e) {
            System.out.println("Exception Handled");
        }
    }

    public static void main(String[] args) {
        Testthrows1 testthrows = new Testthrows1();
        testthrows.p();
        System.out.println("normal flow....");
    }
}
