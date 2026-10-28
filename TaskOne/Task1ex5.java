
import java.util.Scanner;

public class Task1ex5 {

    static final int MAX_TASKS = 100;
    static String[] tasks = new String[MAX_TASKS];
    static boolean[] completed = new boolean[MAX_TASKS];
    static int taskCount = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            choice = readInt(sc, "Enter your choice: ", 1, 5);

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
                    System.out.println("Application closed.");
                    break;
            }
        } while (choice != 5);

        sc.close();
    }

    // Display menu
    public static void displayMenu() {
        System.out.println("\n===== TASK MANAGEMENT =====");
        System.out.println("1. Add Task");
        System.out.println("2. View Tasks");
        System.out.println("3. Search Task");
        System.out.println("4. Complete Task");
        System.out.println("5. Exit");
    }

    // Read a valid integer within a range
    public static int readInt(
            Scanner sc, String message, int min, int max) {

        while (true) {
            System.out.print(message);
            String input = sc.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println("Input cannot be empty.");
                continue;
            }

            try {
                int number = Integer.parseInt(input);

                if (number < min || number > max) {
                    System.out.println(
                            "Enter a number between "
                                    + min + " and " + max + ".");
                    continue;
                }

                return number;

            } catch (NumberFormatException e) {
                System.out.println(
                        "Invalid input. Enter a whole number.");
            }
        }
    }

    // Read non-empty text
    public static String readNonEmptyText(
            Scanner sc, String message) {

        while (true) {
            System.out.print(message);
            String input = sc.nextLine().trim();

            if (input.isEmpty()) {
                System.out.println(
                        "This field cannot be empty. Try again.");
                continue;
            }

            return input;
        }
    }

    // Add a task
    public static void addTask(Scanner sc) {
        if (taskCount >= MAX_TASKS) {
            System.out.println("Task list is full.");
            return;
        }

        String task = readNonEmptyText(
                sc, "Enter task name: ");

        tasks[taskCount] = task;
        completed[taskCount] = false;
        taskCount++;

        System.out.println("Task added successfully.");
    }

    // Display tasks
    public static void displayTasks() {
        if (taskCount == 0) {
            System.out.println(
                    "No tasks available. Add a task first.");
            return;
        }

        for (int i = 0; i < taskCount; i++) {
            String status = completed[i]
                    ? "Completed"
                    : "Pending";

            System.out.println(
                    (i + 1) + ". " + tasks[i]
                            + " [" + status + "]");
        }
    }

    // Search tasks
    public static void searchTask(Scanner sc) {
        if (taskCount == 0) {
            System.out.println(
                    "No tasks available to search.");
            return;
        }

        String keyword = readNonEmptyText(
                sc, "Enter search keyword: ");

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
            System.out.println(
                    "No matching tasks found.");
        }
    }

    // Mark a task as completed
    public static void completeTask(Scanner sc) {
        if (taskCount == 0) {
            System.out.println(
                    "No tasks available to complete.");
            return;
        }

        int number = readInt(
                sc, "Enter task number: ", 1, taskCount);

        if (completed[number - 1]) {
            System.out.println(
                    "This task is already completed.");
            return;
        }

        completed[number - 1] = true;
        System.out.println("Task marked as completed.");
    }
}
