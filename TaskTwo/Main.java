
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Variables
        try (Scanner sc = new Scanner(System.in)) {
            // Variables
            int taskId;
            String taskName;
            String assignedTo;
            int priority;
            double estimatedHours;
            
            System.out.println("==================================");
            System.out.println("      TASK REGISTRATION SYSTEM");
            System.out.println("==================================");
            
            // Validate Task ID
            while (true) {
                System.out.print("Enter Task ID (positive number): ");
                
                if (sc.hasNextInt()) {
                    taskId = sc.nextInt();
                    sc.nextLine();
                    
                    if (taskId > 0) {
                        break;
                    }
                } else {
                    sc.nextLine();
                }
                
                System.out.println("Invalid ID! Enter a positive integer.");
            }
            
            // Validate Task Name
            while (true) {
                System.out.print("Enter Task Name: ");
                taskName = sc.nextLine().trim();
                
                if (!taskName.isEmpty()) {
                    break;
                }
                
                System.out.println("Task name cannot be empty!");
            }
            
            // Validate Assigned Person
            while (true) {
                System.out.print("Enter Assigned Person: ");
                assignedTo = sc.nextLine().trim();
                
                if (!assignedTo.isEmpty()) {
                    break;
                }
                
                System.out.println("Assigned person cannot be empty!");
            }
            
            // Validate Priority
            while (true) {
                System.out.print("Enter Priority (1-5): ");
                
                if (sc.hasNextInt()) {
                    priority = sc.nextInt();
                    sc.nextLine();
                    
                    if (priority >= 1 && priority <= 5) {
                        break;
                    }
                } else {
                    sc.nextLine();
                }
                
                System.out.println("Invalid priority! Choose 1 to 5.");
            }
            
            // Validate Estimated Hours
            while (true) {
                System.out.print("Enter Estimated Hours (greater than 0): ");
                
                if (sc.hasNextDouble()) {
                    estimatedHours = sc.nextDouble();
                    sc.nextLine();
                    
                    if (Double.isFinite(estimatedHours)
                            && estimatedHours > 0) {
                        break;
                    }
                } else {
                    sc.nextLine();
                }
                
                System.out.println(
                        "Invalid hours! Enter a finite number greater than 0."
                );
            }
            
            // Calculate estimated minutes
            long estimatedMinutes =
                    Math.round(estimatedHours * 60);
            
            String priorityLabel;
            
            if (priority >= 4) {
                priorityLabel = "HIGH";
            } else if (priority == 3) {
                priorityLabel = "MEDIUM";
            } else {
                priorityLabel = "LOW";
            }
            
            // Display formatted report
            System.out.println("\n");
            System.out.println("==============================================");
            System.out.println("             TASK REGISTRATION REPORT");
            System.out.println("==============================================");
            
            System.out.printf("%-22s : %d%n", "Task ID", taskId);
            System.out.printf("%-22s : %s%n", "Task Name", taskName);
            System.out.printf("%-22s : %s%n", "Assigned To", assignedTo);
            System.out.printf("%-22s : %d/5%n", "Priority", priority);
            System.out.printf("%-22s : %s%n", "Priority Category",
                    priorityLabel);
            System.out.printf("%-22s : %.2f hours%n",
                    "Estimated Time", estimatedHours);
            System.out.printf("%-22s : %d minutes%n",
                    "Estimated Minutes", estimatedMinutes);
            
            System.out.println("==============================================");
            System.out.println("Task registered successfully!");
            System.out.println("==============================================");
        }
    }
}
