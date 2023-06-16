package constructoroverloading;

class Name
{
    Name(String name)
    {
        System.out.println("My name is = "+name);
    }
}

class Age extends Name
{
    Age(int age)
    {
        super("Rocky");
        System.out.println("My age is = "+age);
    }
}

class Sallary extends Age
{
    Sallary(double Sallary)
    {
        super(28);
        System.out.println("My sallary is = "+Sallary);
    }
}

class Company extends Sallary
{
    Company(String company)
    {
        super(20.369);
        System.out.println("My Company is = "+company);
    }
}

public class Super_Colling_Stmnt 
{
    public static void main(String[] args) 
    {
        new Company("Test Yantra");
    }
    
}
