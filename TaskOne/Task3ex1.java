
public class Task3ex1 {

    private final String title;
    private boolean completed;

    // Constructor
    public Task3ex1(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Task title cannot be empty.");
        }

        this.title = title.trim();
        this.completed = false;
    }

    // Getter: returns the task title
    public String getTitle() {
        return title;
    }

    // Getter: returns completion status
    public boolean isCompleted() {
        return completed;
    }

    // Behavior: mark the task as completed
    public void markCompleted() {
        this.completed = true;
    }

    // Display a readable task description
    @Override
    public String toString() {
        String status = completed ? "Completed" : "Pending";
        return title + " [" + status + "]";
    }
}
