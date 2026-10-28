class Student {
    private String name;
    private int age;

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for age with validation
    public void setAge(int age) {
        if (age >= 1 && age <= 100) {
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }

    // Getter for age
    public int getAge() {
        return age;
    }
}

public class EncapsulationMain {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Nani");
        s.setAge(23);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());

        s.setAge(-5);
    }
}