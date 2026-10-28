
import java.util.Scanner;

public class Task1ex4 {

    // Search for a task and return its index
    public static int searchTask(String[] tasks, int count,
            String keyword) {
        for (int i = 0; i < count; i++) {
            if (tasks[i].equalsIgnoreCase(keyword)) {
                return i;
            }
        }
        return -1; // Task not found
    }

    // Count tasks containing a keyword
    public static int countMatchingTasks(String[] tasks, int count,
            String keyword) {
        int matches = 0;

        for (int i = 0; i < count; i++) {
            if (tasks[i].toLowerCase()
                    .contains(keyword.toLowerCase())) {
                matches++;
            }
        }
        return matches;
    }

    // Find the shortest task name
    public static String findShortestTask(String[] tasks, int count) {
        if (count == 0) {
            return "No tasks available";
        }

        String shortest = tasks[0];

        for (int i = 1; i < count; i++) {
            if (tasks[i].length() < shortest.length()) {
                shortest = tasks[i];
            }
        }
        return shortest;
    }

    // Find the longest task name
    public static String findLongestTask(String[] tasks, int count) {
        if (count == 0) {
            return "No tasks available";
        }

        String longest = tasks[0];

        for (int i = 1; i < count; i++) {
            if (tasks[i].length() > longest.length()) {
                longest = tasks[i];
            }
        }
        return longest;
    }

    // Validate an integer within a specified range
    public static int readNumber(Scanner sc, int min, int max) {
        while (true) {
            System.out.print("Enter a number (" + min + "-" + max + "): ");
            String input = sc.nextLine().trim();

            try {
                int number = Integer.parseInt(input);

                if (number >= min && number <= max) {
                    return number;
                }

                System.out.println("Number is outside the allowed range.");
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Enter a whole number.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] tasks = new String[10];
        int count;

        count = readNumber(sc, 1, 10);

        // Input validation for task names
        for (int i = 0; i < count; i++) {
            while (true) {
                System.out.print("Enter task " + (i + 1) + ": ");
                String task = sc.nextLine().trim();

                if (!task.isEmpty()) {
                    tasks[i] = task;
                    break;
                }

                System.out.println("Task name cannot be empty.");
            }
        }

        // SEARCHING
        System.out.print("\nEnter exact task name to search: ");
        String keyword = sc.nextLine().trim();

        int index = searchTask(tasks, count, keyword);

        if (index != -1) {
            System.out.println("Task found at position " + (index + 1));
        } else {
            System.out.println("Task not found.");
        }

        // COUNTING
        System.out.print("\nEnter keyword to count matching tasks: ");
        String countKeyword = sc.nextLine().trim();

        if (countKeyword.isEmpty()) {
            System.out.println("Counting skipped: keyword is empty.");
        } else {
            int matches = countMatchingTasks(
                    tasks, count, countKeyword);
            System.out.println("Matching tasks: " + matches);
        }

        // MINIMUM AND MAXIMUM
        System.out.println("\nShortest task: "
                + findShortestTask(tasks, count));

        System.out.println("Longest task: "
                + findLongestTask(tasks, count));

        sc.close();
    }
}
