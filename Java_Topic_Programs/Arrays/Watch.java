package Arrays;

class ShowRoom
{
    void rolexWatch()
    {
        System.out.println("Rolex Watch");
    }

    void titanWatch()
    {
        System.out.println("Titan Watch");
    }
}

class Person_1
{
    static void needWatch(ShowRoom room)
    {
        room.rolexWatch();
    }
}

class Person_2
{
    static void needWatch(ShowRoom room)
    {
        room.titanWatch();
    }
}

public class Watch 
{
    public static void main(String[] args) 
    {
        ShowRoom showRoom = new ShowRoom();
        Person_1.needWatch(showRoom);
        Person_2.needWatch(showRoom);
    }
}
