import demo.*;

public class HelloWord
{
    public static void main(String[] args) {
        IAnimal dog = new Dog("cho");
        dog.eat();
        dog.drink();
        ((Dog) dog).sua();
    }
}
