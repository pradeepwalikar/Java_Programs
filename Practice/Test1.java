public class Test1 
{
    public static String calculate(int n)
    {
        String string="";
        int fact = 1;
        for(int i=n ; i>=1 ; i--)
        {
            fact = fact*i;
        }

        string += fact;
        return string;
    }
    public static void main(String[] args) 
    {
        Test1.calculate(2);
    }
}
