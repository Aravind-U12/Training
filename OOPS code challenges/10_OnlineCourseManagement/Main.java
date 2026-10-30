import java.util.ArrayList;
import java.util.List;

class Course {
    private final int id;
    private final String title;
    private final String instructor;
    private final List<String> enrolledStudents = new ArrayList<>();

    public Course(int id, String title, String instructor) {
        this.id = id;
        this.title = title;
        this.instructor = instructor;
    }

    public void enroll(String studentName) {
        if (studentName == null || studentName.isBlank()) {
            throw new IllegalArgumentException("Student name is required");
        }
        if (!enrolledStudents.contains(studentName)) {
            enrolledStudents.add(studentName);
            System.out.println(studentName + " enrolled in " + title);
        } else {
            System.out.println(studentName + " is already enrolled.");
        }
    }

    public void displayDetails() {
        System.out.println("Course ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Instructor: " + instructor);
        System.out.println("Enrolled students: " + enrolledStudents.size());
        for (String student : enrolledStudents) {
            System.out.println("- " + student);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Course javaCourse = new Course(101, "Java Fundamentals", "Priya");
        javaCourse.enroll("Aarav");
        javaCourse.enroll("Meera");
        javaCourse.enroll("Aarav");
        System.out.println();
        javaCourse.displayDetails();
    }
}
