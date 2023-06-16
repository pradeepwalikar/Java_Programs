package Arrays;

class Amazon
{
    void product()
    {
        System.out.println("amazon products");
    }
}

class Customer_1
{
    static void needproduct(Amazon amazon)
    {
        amazon.product();
    }
}

class Customer_2
{
   static void needproduct(Amazon amazon)
   {
    amazon.product();
   }
}

public class Ekart 
{
    public static void main(String[] args) 
    {
        Amazon amazon = new Amazon();
        Customer_1.needproduct(amazon);
        Customer_2.needproduct(amazon);
    }
}
