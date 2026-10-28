import java.util.Scanner;

public class TaskBasics {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

                System.out.print("Enter a number: ");

                if (sc.hasNextInt()) {
                        int num = sc.nextInt();

                        if (num > 0) {
                                System.out.println("Number is positive.");
                        } else if (num < 0) {
                                System.out.println("Number is negative.");
                        } else {
                                System.out.println("Number is zero.");
                        }
                } else {
                        System.out.println("Invalid input! Enter an integer.");
                }
                sc.close();
        }
}