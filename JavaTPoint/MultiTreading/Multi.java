package MultiTreading;

public class Multi extends Thread
{
    public void run()
    {
        System.out.println("tread is running...");
    }

    public static void main(String[] args) 
    {
        Multi multi = new Multi();
        multi.start();
    }
}
