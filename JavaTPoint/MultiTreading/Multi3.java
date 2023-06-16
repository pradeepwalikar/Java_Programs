package MultiTreading;

public class Multi3 implements Runnable
{
    public void run()
    {
        System.out.println("tread is running...");
    }

    public static void main(String[] args) 
    {
        Multi3 multi3 = new Multi3();
        Thread thread = new Thread(multi3);
        thread.start();
    }
}
