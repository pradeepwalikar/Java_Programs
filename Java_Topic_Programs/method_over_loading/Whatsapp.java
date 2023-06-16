package method_over_loading;

public class Whatsapp 
{
        void send(int a)
        {
            System.out.println("Sending number "+a);
        }

        void send(String c)
        {
            System.out.println("Texting msg "+c);
        }

        void send(int b, String msg)
        {
            System.out.println("Sending no "+b+" Texting msg "+msg);
        }

        void send(int d,String img,String msg)
        {
            System.out.println("Sending number "+d+" Sending img "+img+" Texting msg "+msg);
        }

        public static void main(String[] args) {
            Whatsapp whatsapp = new Whatsapp();
            whatsapp.send(10);
            whatsapp.send("hi");
            whatsapp.send(20, "hello");
            whatsapp.send(30, "image", "Bye");
        }
}
