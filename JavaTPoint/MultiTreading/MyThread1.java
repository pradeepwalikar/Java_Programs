package MultiTreading;

public class MyThread1 
{
    public static void main(String[] args) 
    {
        Thread thread = new Thread("My first tread");
        thread.start();

        String string = thread.getName();
        System.out.println(string);
    }
}
