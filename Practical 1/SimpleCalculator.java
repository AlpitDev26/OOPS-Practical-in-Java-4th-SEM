import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            try {
                // Taking user input
                System.out.print("Enter first number: ");
                double num1 = sc.nextDouble();

                System.out.print("Enter operator (+, -, *, /): ");
                char operator = sc.next().charAt(0);

                System.out.print("Enter second number: ");
                double num2 = sc.nextDouble();

                double result = 0;

                // Conditional logic
                switch (operator) {

                    case '+':
                        result = num1 + num2;
                        break;

                    case '-':
                        result = num1 - num2;
                        break;

                    case '*':
                        result = num1 * num2;
                        break;

                    case '/':
                        if (num2 == 0) {
                            System.out.println("Error: Division by zero is not allowed.");
                        } else {
                            result = num1 / num2;
                            System.out.println("Result = " + result);
                        }
                        break;

                    default:
                        System.out.println("Invalid operator!");
                }

                // Display result for other operations
                if (operator != '/' || num2 != 0) {
                    System.out.println("Result = " + result);
                }

            } catch (Exception e) {
                System.out.println("Invalid input! Please enter numbers only.");
                sc.nextLine(); // clear invalid input
            }

            // Looping construct
            System.out.print("Do you want to continue? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Calculator Closed.");
        sc.close();
    }
}