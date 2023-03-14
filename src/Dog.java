public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }
    public void makeSound() {
//        super.makeSound(); // gọi phương thức makeSound() của lớp cha
        System.out.println("The dog barks");
    }
    public void printName() {
        System.out.println("The name of the dog is " + super.name); // truy cập trường name của lớp cha
    }

    public static void main(String[] args) {
        Dog d1 = new Dog("Bug");
        d1.makeSound();
        d1.printName();
    }
}
