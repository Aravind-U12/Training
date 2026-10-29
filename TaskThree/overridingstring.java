class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

public class overridingstring {
    public static void main(String[] args) {
        Student s1 = new Student("Luffy", 24);

        System.out.println(s1);
    }
}