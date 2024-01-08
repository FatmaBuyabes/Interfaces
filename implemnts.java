package src;

import src.Interface.Cat;
import src.Interface.Dog;

public class implemnts {
    public static void main(String[] args) throws Exception {
        Dog doggie = new Dog();
        Cat munchkin = new Cat();

        doggie.eat();
        doggie.sleep();
        doggie.makeSound();

        munchkin.eat();
        munchkin.sleep();
        munchkin.makeSound();
    }
}
