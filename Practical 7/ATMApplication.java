import java.util.Scanner;

public class ATMApplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 10000; // Initial Balance
        int choice;

        do {

            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            try {

                switch (choice) {

                    case 1:
                        System.out.println("Current Balance: " + balance);
                        break;

                    case 2:
                        System.out.print("Enter amount to deposit: ");
                        double deposit = sc.nextDouble();

                        // Invalid input check
                        if (deposit <= 0) {
                            throw new IllegalArgumentException(
                                    "Deposit amount must be positive.");
                        }

                        balance = balance + deposit;
                        System.out.println("Money Deposited Successfully.");
                        break;

                    case 3:
                        System.out.print("Enter amount to withdraw: ");
                        double withdraw = sc.nextDouble();

                        // Invalid input check
                        if (withdraw <= 0) {
                            throw new IllegalArgumentException(
                                    "Withdrawal amount must be positive.");
                        }

                        // Insufficient funds check
                        if (withdraw > balance) {
                            throw new ArithmeticException(
                                    "Insufficient Balance.");
                        }

                        balance = balance - withdraw;
                        System.out.println("Please collect your cash.");
                        break;

                    case 4:
                        System.out.println("Thank You for using ATM.");
                        break;

                    default:
                        System.out.println("Invalid Choice!");

                }

            } catch (ArithmeticException e) {

                System.out.println("Error: " + e.getMessage());

            } catch (IllegalArgumentException e) {

                System.out.println("Error: " + e.getMessage());

            } catch (Exception e) {

                System.out.println("Invalid Input!");

                sc.nextLine(); // Clear invalid input
            }

            finally {
                System.out.println("Transaction Completed.");
            }

        } while (choice != 4);

        sc.close();
    }
}