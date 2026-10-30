import java.util.LinkedHashMap;
import java.util.Map;

class SchoolStudent {
    private final String name;
    private final Map<String, Integer> marks = new LinkedHashMap<>();

    public SchoolStudent(String name) {
        this.name = name;
    }

    public void addMark(String subject, int mark) {
        if (mark < 0 || mark > 100) throw new IllegalArgumentException("Mark must be 0-100");
        marks.put(subject, mark);
    }

    public int total() {
        return marks.values().stream().mapToInt(Integer::intValue).sum();
    }

    public double average() {
        return marks.isEmpty() ? 0 : (double) total() / marks.size();
    }

    public String result() {
        if (marks.isEmpty()) return "No result";
        for (int mark : marks.values()) {
            if (mark < 35) return "Fail";
        }
        return "Pass";
    }

    public void printReport() {
        System.out.println("Result for: " + name);
        marks.forEach((subject, mark) ->
                System.out.println(subject + ": " + mark));
        System.out.println("Total: " + total());
        System.out.printf("Average: %.2f%n", average());
        System.out.println("Status: " + result());
    }
}

public class Main {
    public static void main(String[] args) {
        SchoolStudent student = new SchoolStudent("Ishaan");
        student.addMark("Mathematics", 88);
        student.addMark("Science", 76);
        student.addMark("English", 91);
        student.printReport();
    }
}
