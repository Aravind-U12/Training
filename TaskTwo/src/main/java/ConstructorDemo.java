/**
 * Demonstrates constructors and constructor parameter initialization.
 */
public class ConstructorDemo {
    public static void run() {
        ConstructorStudent student = new ConstructorStudent("Aravind", 25);
        student.display();
    }

    private static class ConstructorStudent {
        private final String name;
        private final int age;

        ConstructorStudent(String name, int age) {
            // A constructor runs automatically when an object is created.
            this.name = name;
            this.age = age;
        }

        void display() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }
}
