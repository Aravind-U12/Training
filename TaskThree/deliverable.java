import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

class StudentRecord {
    private final int id;
    private final String name;

    StudentRecord(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof StudentRecord)) {
            return false;
        }
        StudentRecord other = (StudentRecord) object;
        return id == other.id && Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return name + " (ID: " + id + ")";
    }
}

public class deliverable {
    public static void main(String[] args) {
        StudentRecord student1 = new StudentRecord(2, "Rahul");
        StudentRecord student2 = new StudentRecord(2, "Rahul");
        StudentRecord student3 = new StudentRecord(1, "Anita");

        System.out.println("Reference equality (==): " + (student1 == student2));
        System.out.println("Object equality (equals): " + student1.equals(student2));
        System.out.println("Equal objects have equal hash codes: "
                + (student1.hashCode() == student2.hashCode()));

        HashSet<StudentRecord> uniqueStudents = new HashSet<>();
        uniqueStudents.add(student1);
        uniqueStudents.add(student2);
        uniqueStudents.add(student3);
        System.out.println("Unique students: " + uniqueStudents.size());

        List<StudentRecord> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);

        students.sort(Comparator.comparingInt(StudentRecord::getId));
        System.out.println("Sorted by ID: " + students);

        students.sort(Comparator.comparing(StudentRecord::getName));
        System.out.println("Sorted by name: " + students);
    }
}
