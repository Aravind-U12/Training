
import java.util.Scanner;

public class Task1ex6 {

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
                    viewTasks();
                    break;

                case 3:
                    searchTask(sc);
                    break;

                case 4:
                    completeTask(sc);
                    break;

                case 5:
                    System.out.println("Thank you for using Task Manager!");
                    break;

                default:
                    System.out.println(
                            "Invalid choice. Select an option from 1 to 5.");
            }

        } while (choice != 5);

        sc.close();
    }

    // Displays the menu
    public static void displayMenu() {
        System.out.println("\n===== TASK MANAGEMENT SYSTEM =====");
        System.out.println("1. Add Task");
        System.out.println("2. View Tasks");
        System.out.println("3. Search Task");
        System.out.println("4. Complete Task");
        System.out.println("5. Exit");
    }

    // Reads an integer and handles invalid input
    public static int readInteger(Scanner sc, String message) {
        while (true) {
            System.out.print(message);
            String input = sc.nextLine().trim();

            try {
                if (input.isEmpty()) {
                    System.out.println("Input cannot be empty.");
                    continue;
                }

                return Integer.parseInt(input);

            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid whole number.");
            }
        }
    }

    // Reads non-empty text
    public static String readNonEmptyText(
            Scanner sc, String message) {
        while (true) {
            System.out.print(message);
            String input = sc.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Input cannot be empty.");
                continue;
            }

            return input;
        }
    }

    // Operation 1: Adds a task
    public static void addTask(Scanner sc) {
        if (taskCount >= MAX_TASKS) {
            System.out.println("Task list is full.");
            return;
        }

        String task = readNonEmptyText(sc, "Enter task name: ");

        if (findTaskIndex(task) != -1) {
            System.out.println("This task already exists.");
            return;
        }

        tasks[taskCount] = task;
        completed[taskCount] = false;
        taskCount++;

        System.out.println("Task added successfully.");
    }

    // Operation 2: Displays all tasks
    public static void viewTasks() {
        if (taskCount == 0) {
            System.out.println("No tasks available.");
            return;
        }

        System.out.println("\n----- YOUR TASKS -----");

        for (int i = 0; i < taskCount; i++) {
            String status = completed[i]
                    ? "Completed"
                    : "Pending";

            System.out.println(
                    (i + 1) + ". " + tasks[i] + " [" + status + "]");
        }
    }

    // Operation 3: Searches for a task
    public static void searchTask(Scanner sc) {
        if (taskCount == 0) {
            System.out.println("No tasks available to search.");
            return;
        }

        String keyword = readNonEmptyText(
                sc, "Enter task name or keyword: ");

        boolean found = false;

        for (int i = 0; i < taskCount; i++) {
            if (tasks[i].toLowerCase()
                    .contains(keyword.toLowerCase())) {
                System.out.println(
                        (i + 1) + ". " + tasks[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No matching task found.");
        }
    }

    // Reusable method: Finds an exact task name
    public static int findTaskIndex(String taskName) {
        for (int i = 0; i < taskCount; i++) {
            if (tasks[i].equalsIgnoreCase(taskName)) {
                return i;
            }
        }

        return -1;
    }

    // Operation 4: Marks a task as completed
    public static void completeTask(Scanner sc) {
        if (taskCount == 0) {
            System.out.println("No tasks available to complete.");
            return;
        }

        viewTasks();

        int number = readInteger(
                sc, "Enter task number to complete: ");

        if (number < 1 || number > taskCount) {
            System.out.println("Invalid task number.");
            return;
        }

        if (completed[number - 1]) {
            System.out.println("Task is already completed.");
            return;
        }

        completed[number - 1] = true;
        System.out.println("Task marked as completed.");
    }
}
