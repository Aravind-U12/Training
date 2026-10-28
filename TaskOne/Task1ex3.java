
import java.util.Scanner;

public class Task1ex3 {

    static final int MAX_TASKS = 100;

    static String[] tasks = new String[MAX_TASKS];
    static boolean[] completed = new boolean[MAX_TASKS];
    static int taskCount = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            choice = readInteger(sc, "Enter your choice: ");

            switch (choice) {
                case 1:
                    addTask(sc);
                    break;

                case 2:
                    displayTasks();
                    break;

                case 3:
                    searchTask(sc);
                    break;

                case 4:
                    completeTask(sc);
                    break;

                case 5:
                    System.out.println("Exiting application...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 5);

        sc.close();
    }

    // Responsibility: Display the application menu
    public static void displayMenu() {
        System.out.println("\n===== TASK MANAGEMENT =====");
        System.out.println("1. Add Task");
        System.out.println("2. View Tasks");
        System.out.println("3. Search Task");
        System.out.println("4. Complete Task");
        System.out.println("5. Exit");
    }

    // Responsibility: Read and validate integer input
    public static int readInteger(Scanner sc, String message) {
        while (true) {
            System.out.print(message);
            String input = sc.nextLine().trim();

            try {
                return Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }

    // Responsibility: Add a new task
    public static void addTask(Scanner sc) {
        if (taskCount >= MAX_TASKS) {
            System.out.println("Task list is full.");
            return;
        }

        System.out.print("Enter task name: ");
        String task = sc.nextLine().trim();

        if (task.isEmpty()) {
            System.out.println("Task name cannot be empty.");
            return;
        }

        tasks[taskCount] = task;
        completed[taskCount] = false;
        taskCount++;

        System.out.println("Task added successfully.");
    }

    // Responsibility: Display all tasks
    public static void displayTasks() {
        if (taskCount == 0) {
            System.out.println("No tasks available.");
            return;
        }

        for (int i = 0; i < taskCount; i++) {
            String status = completed[i]
                    ? "Completed"
                    : "Pending";

            System.out.println(
                    (i + 1) + ". " + tasks[i] + " - " + status);
        }
    }

    // Responsibility: Search tasks by keyword
    public static void searchTask(Scanner sc) {
        System.out.print("Enter search keyword: ");
        String keyword = sc.nextLine().trim();

        if (keyword.isEmpty()) {
            System.out.println("Search keyword cannot be empty.");
            return;
        }

        boolean found = false;

        for (int i = 0; i < taskCount; i++) {
            if (containsIgnoreCase(tasks[i], keyword)) {
                System.out.println(
                        (i + 1) + ". " + tasks[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching tasks found.");
        }
    }

    // Responsibility: Compare strings without case sensitivity
    public static boolean containsIgnoreCase(
            String text, String keyword) {
        return text.toLowerCase()
                .contains(keyword.toLowerCase());
    }

    // Responsibility: Validate a task number
    public static boolean isValidTaskNumber(int number) {
        return number >= 1 && number <= taskCount;
    }

    // Responsibility: Mark a selected task as completed
    public static void completeTask(Scanner sc) {
        if (taskCount == 0) {
            System.out.println("No tasks available.");
            return;
        }

        int number = readInteger(sc, "Enter task number: ");

        if (!isValidTaskNumber(number)) {
            System.out.println("Invalid task number.");
            return;
        }

        completed[number - 1] = true;
        System.out.println("Task marked as completed.");
    }

    // Responsibility: Return the current number of tasks
    public static int getTaskCount() {
        return taskCount;
    }
}
