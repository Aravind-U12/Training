public abstract class Animal {

    // Abstract method
    abstract void makeSound();

    // Concrete method
    void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {

    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class AbstractDemo {
    public static void main(String[] args) {

        // Animal a = new Animal(); // Compilation error

        Animal pet = new Dog();

        pet.makeSound();
        pet.sleep();
    }
}
