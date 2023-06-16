package method_overridding;

class Whatsapp_v1
{
    void send()
    {
        System.out.println("Send 5 images");
    }
}

class Whatsapp_v2 extends Whatsapp_v1
{
    void send()
    {
        System.out.println("Send 10 images");
        super.send();
    }
}

public class MainClass_1 
{
    public static void main(String[] args) {
        Whatsapp_v2 v2 = new Whatsapp_v2();
        v2.send();
    }
}
