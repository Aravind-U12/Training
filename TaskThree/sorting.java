import java.util.*;

class Task implements Comparable<Task> {
    private int id;
    private String title;
    private int priority;

    public Task(int id, String title, int priority) {
        this.id = id;
        this.title = title;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(Task other) {
        return Integer.compare(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Task ID: " + id
                + ", Title: " + title
                + ", Priority: " + priority;
    }
}

public class sorting {
    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();

        tasks.add(new Task(103, "Testing", 2));
        tasks.add(new Task(101, "Design", 3));
        tasks.add(new Task(102, "Coding", 1));

        // Natural order: task ID
        Collections.sort(tasks);

        System.out.println("Sorted by ID:");
        tasks.forEach(System.out::println);

        // Custom order: priority, highest first
        tasks.sort(
            Comparator.comparingInt(Task::getPriority).reversed()
        );

        System.out.println("\nSorted by priority:");
        tasks.forEach(System.out::println);
    }
}