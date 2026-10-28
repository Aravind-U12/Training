
import java.util.Scanner;

public class Task1ex2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] tasks = new String[100];
        boolean[] completed = new boolean[100];
        int taskCount = 0;
        int choice;

        do {
            System.out.println("\n===== TASK MANAGEMENT =====");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Search Task");
            System.out.println("4. Complete Task");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            // Validate menu input
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Enter a number.");
                sc.nextLine();
                choice = 0;
                continue;
            }

            choice = sc.nextInt();
            sc.nextLine();

            // CONDITION: Select an operation
            switch (choice) {

                case 1:
                    if (taskCount < tasks.length) {
                        System.out.print("Enter task name: ");
                        String task = sc.nextLine().trim();

                        if (task.isEmpty()) {
                            System.out.println("Task cannot be empty.");
                        } else {
                            tasks[taskCount] = task;
                            completed[taskCount] = false;
                            taskCount++;
                            System.out.println("Task added successfully!");
                        }
                    } else {
                        System.out.println("Task list is full.");
                    }
                    break;

                case 2:
                    if (taskCount == 0) {
                        System.out.println("No tasks available.");
                    } else {
                        System.out.println("\nYour Tasks:");

                        // LOOP: Display every task
                        for (int i = 0; i < taskCount; i++) {
                            String status = completed[i]
                                    ? "Completed"
                                    : "Pending";

                            System.out.println(
                                    (i + 1) + ". " +
                                            tasks[i].toUpperCase() +
                                            " - " + status);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter task keyword: ");
                    String keyword = sc.nextLine().trim();

                    boolean found = false;

                    // STRING OPERATION + LOOP
                    for (int i = 0; i < taskCount; i++) {
                        if (tasks[i].toLowerCase()
                                .contains(keyword.toLowerCase())) {
                            System.out.println(
                                    (i + 1) + ". " + tasks[i]);
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Task not found.");
                    }
                    break;

                case 4:
                    if (taskCount == 0) {
                        System.out.println("No tasks to complete.");
                        break;
                    }

                    System.out.print("Enter task number: ");

                    if (!sc.hasNextInt()) {
                        System.out.println("Enter a valid task number.");
                        sc.nextLine();
                        break;
                    }

                    int number = sc.nextInt();
                    sc.nextLine();

                    if (number >= 1 && number <= taskCount) {
                        completed[number - 1] = true;
                        System.out.println("Task marked completed!");
                    } else {
                        System.out.println("Invalid task number.");
                    }
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
}
