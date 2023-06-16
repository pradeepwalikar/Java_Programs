package polymorsphism.runtime;

class Animal
{
    void noise()
    {
        System.out.println("Some noise");
    }
}

class Cat extends Animal
{
    void noise()
    {
        System.out.println("Cat noise");
    }
}

class Dog extends Animal
{
    void noise()
    {
        System.out.println("Dog noise");
    }
}

class Snake extends Animal
{
    void noise()
    {
        System.out.println("Snake noise");
    }
}

class Stimulator
{
    static void ansim(Animal animal)
    {
        animal.noise();
    }
}

public class Program_1 
{
    public static void main(String[] args)
    {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Snake snake = new Snake();
        Stimulator.ansim(cat);
        Stimulator.ansim(dog);
        Stimulator.ansim(snake);
    }
}
