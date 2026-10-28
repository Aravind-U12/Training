
public class Task3ex2 {
    private final String title;
    private boolean completed;

    public Task3ex2(String title) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Task title cannot be empty");
        }

        this.title = title.trim();
        this.completed = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markCompleted() {
        completed = true;
    }

    @Override
    public String toString() {
        return title + (completed
                ? " [Completed]"
                : " [Pending]");
    }
}
