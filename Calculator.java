import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {

            int choice;

            do {
                System.out.println("\n===== CALCULATOR MENU =====");
                System.out.println("1. Addition");
                System.out.println("2. Subtraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Exit");

                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                if (choice == 5) {
                    System.out.println("Exiting Calculator... Goodbye!");
                    break;
                }

                System.out.print("Enter first number: ");
                double num1 = sc.nextDouble();

                System.out.print("Enter second number: ");
                double num2 = sc.nextDouble();

                double result = 0;

                switch (choice) {

                    case 1:
                        result = num1 + num2;
                        System.out.println("Result: " + result);
                        break;

                    case 2:
                        result = num1 - num2;
                        System.out.println("Result: " + result);
                        break;

                    case 3:
                        result = num1 * num2;
                        System.out.println("Result: " + result);
                        break;

                    case 4:
                        if (num2 != 0) {
                            result = num1 / num2;
                            System.out.println("Result: " + result);
                        } else {
                            System.out.println("Cannot divide by zero!");
                        }
                        break;

                    default:
                        System.out.println("Invalid choice! Please select 1-5.");
                }

            } while (true);
        }
    }
}