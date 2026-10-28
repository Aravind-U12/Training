/**
 * Demonstrates this: it distinguishes fields from constructor parameters.
 */
public class ThisKeywordDemo {
    public static void run() {
        StudentWithThis student = new StudentWithThis("Nani", 23);
        student.display();
    }

    private static class StudentWithThis {
        private String name;
        private int age;

        StudentWithThis(String name, int age) {
            this.name = name; // Refers to the class field
            this.age = age;   // Refers to the class field
        }

        void display() {
            System.out.println("Name: " + this.name);
            System.out.println("Age: " + this.age);
        }
    }
}
