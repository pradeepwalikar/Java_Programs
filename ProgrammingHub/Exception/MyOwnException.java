package ProgrammingHub.Exception;

class MyOwnException 
{
    public static void main(String[] args) 
    {
        try 
        {
           MyOwnException.myTest(null);
        } 
        catch (MyAppException myAppException) 
        {
            System.out.println("Inside catch block: " + mae.getMassage());
        }
    }

    static void myTest(String string) throws MyAppException
    {
        if (string == null) 
        {
            throw new MyAppException("String value is null:")
        }
    }
}

class MyAppException extends Exception
{
    private String massage = null;

    public MyAppException()
    {
        super();
    }

    public MyAppException(String massage)
    {
        super(massage);
        this.massage = massage;
    }

    public MyAppException(Throwable cause)
    {
        super(cause);
    }

    @Override
    public String toString()
    {
        return message;
    }

    @Override
    public String getMassage()
    {
        return message;
    }
}
