final class Student {
    private final int id;
    private final String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}

public class immutable {
    public static void main(String[] args) {
        Student student = new Student(101, "Rahul");

        System.out.println(student.getId());
        System.out.println(student.getName());
    }
}