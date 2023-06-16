package Object_Class.toString_Method;

public class Shop 
{
    String brand;
    int quantity;
    double price;
    String location;

    Shop(String brand,int quantity,double price,String location)
    {
        this.brand=brand;
        this.quantity=quantity;
        this.price=price;
        this.location=location;
    }

    public String toString()
    {
        return brand+" "+quantity+" "+price+" "+location;
    }

    public static void main(String[] args) 
    {
        Shop shop = new Shop("puma", 2, 700, "Bangalore");
        System.out.println(shop);
    }
}
