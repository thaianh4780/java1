package demo;

public class Cat implements IAnimal {

    public String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void makeSound() {
        System.out.println("abd");
    }

    @Override
    public void eat() {

    }

    @Override
    public void drink() {

    }

}
