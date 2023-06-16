package MultiTreading.SleepMethod;

public class TestSleepMethod1 extends Thread
{
    public void run()
    {
        for(int i=1;i<5;i++)
        {
            try 
            {
                Thread.sleep(500);
            }
            catch (InterruptedException e) 
            {
               System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args)
    {
        TestSleepMethod1 method1 = new TestSleepMethod1();
        TestSleepMethod1 method12 = new TestSleepMethod1();

        method1.start();
        method12.start();
    }
}
