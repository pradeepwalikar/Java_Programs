package MultiTreading.namethread;

public class TestMultiNaming1 extends Thread
{
    public void run()
    {
        System.out.println("ruuning...");
    }

    public static void main(String[] args) 
    {
        TestMultiNaming1 multiNaming1 = new TestMultiNaming1();
        TestMultiNaming1 multiNaming12 = new TestMultiNaming1();

        System.out.println("Name of the multiNaming1: "+multiNaming1.getName());
        System.out.println("Name of the multiNaming12: "+multiNaming12.getName());

        multiNaming1.start();
        multiNaming12.start();

        multiNaming1.setName("Walikar");
        System.out.println("After changing name of multiNaming1: "+multiNaming1.getName());
    }
}
