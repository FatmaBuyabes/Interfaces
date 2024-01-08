package src.Interface;

public class Cat implements Animal {

    @Override
    public void eat() {
        System.out.println("The cat is eating");
    }

    @Override
    public void sleep() {
        System.out.println("The cat is sleeping");
    }

    @Override
    public void makeSound() {
        System.out.println("The cat is meowing");
    }

}
