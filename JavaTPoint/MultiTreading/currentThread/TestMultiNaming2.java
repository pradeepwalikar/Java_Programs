package MultiTreading.currentThread;

public class TestMultiNaming2 extends Thread
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) 
    {
        TestMultiNaming2 multiNaming2 = new TestMultiNaming2();
        TestMultiNaming2 multiNaming22 = new TestMultiNaming2();

        multiNaming2.start();
        multiNaming22.start();
    }
}
