/**
 * Demonstrates method overriding: a subclass provides its own implementation.
 */
public class MethodOverridingDemo {
    public static void run() {
        Animal pet = new Dog();
        pet.sound(); // Dynamic dispatch calls Dog's implementation.
    }

    private static class Animal {
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    private static class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Dog barks");
        }
    }
}
