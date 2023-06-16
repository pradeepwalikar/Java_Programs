package MultiTreading;

public class MyThread2 implements Runnable
{
    public void run()
    {
        System.out.println("Now the tread is running...");
    }

    public static void main(String[] args)
    {
        Runnable runnable = new MyThread2();

        Thread thread = new Thread(runnable,"My new thread");

        thread.start();

        String string = thread.getName();

        System.out.println(string);
    }
}
