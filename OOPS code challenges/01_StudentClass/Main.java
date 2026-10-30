class Student {
    private final int id;
    private String name;
    private double marks;

    public Student(int id, String name, double marks) {
        if (id <= 0) throw new IllegalArgumentException("ID must be positive");
        if (name == null || name.isBlank()) throw new IllegalArgumentException("Name is required");
        setMarks(marks);
        this.id = id;
        this.name = name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("Name is required");
        this.name = name;
    }

    public void setMarks(double marks) {
        if (marks < 0 || marks > 100) throw new IllegalArgumentException("Marks must be 0-100");
        this.marks = marks;
    }

    public void display() {
        System.out.printf("ID: %d%nName: %s%nMarks: %.1f%n", id, name, marks);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student(101, "Aarav", 87.5);
        student.display();
        student.setMarks(92);
        System.out.println("After updating marks:");
        student.display();
    }
}
