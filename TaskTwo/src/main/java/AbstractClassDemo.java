/**
 * Demonstrates abstraction: an abstract class cannot be instantiated directly,
 * but subclasses implement its abstract behavior and can inherit concrete methods.
 */
public class AbstractClassDemo {
    public static void run() {
        Animal pet = new Dog();
        pet.makeSound();
        pet.sleep();
    }

    private abstract static class Animal {
        abstract void makeSound();

        void sleep() {
            System.out.println("Animal is sleeping");
        }
    }

    private static class Dog extends Animal {
        @Override
        void makeSound() {
            System.out.println("Dog barks");
        }
    }
}
