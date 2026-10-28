/**
 * Demonstrates encapsulation: fields are private and accessed through methods.
 */
public class EncapsulationDemo {
    public static void run() {
        Student student = new Student();
        student.setName("Nani");
        student.setAge(23);

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }

    private static class Student {
        private String name;
        private int age;

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setAge(int age) {
            if (age >= 1 && age <= 100) {
                this.age = age;
            } else {
                System.out.println("Invalid age!");
            }
        }

        public int getAge() {
            return age;
        }
    }
}
