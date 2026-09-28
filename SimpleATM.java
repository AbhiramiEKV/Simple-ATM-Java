import java.util.Scanner;

public class SimpleATM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double balance = 1000.00;
        int choice = 0;

        do {
            System.out.println("\n========================");
            System.out.println("       SIMPLE ATM");
            System.out.println("========================");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.println("========================");
            System.out.print("Enter your choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input! Please enter a number from 1 to 4.");
                sc.next();
                continue;
            }

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.printf("Your balance: Rs.%.2f%n", balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: Rs.");

                    double deposit = sc.nextDouble();

                    if (deposit > 0) {
                        balance += deposit;
                        System.out.printf("Deposited Rs.%.2f successfully.%n", deposit);
                        System.out.printf("New balance: Rs.%.2f%n", balance);
                    } else {
                        System.out.println("Deposit amount must be greater than zero.");
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: Rs.");

                    double withdraw = sc.nextDouble();

                    if (withdraw <= 0) {
                        System.out.println("Withdrawal amount must be greater than zero.");
                    } else if (withdraw <= balance) {
                        balance -= withdraw;
                        System.out.printf("Withdrawn Rs.%.2f successfully.%n", withdraw);
                        System.out.printf("Remaining balance: Rs.%.2f%n", balance);
                    } else {
                        System.out.println("Insufficient balance!");
                    }
                    break;

                case 4:
                    System.out.println("\nThank you for using Simple ATM!");
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice! Please select 1-4.");
            }

        } while (choice != 4);

        sc.close();
    }
}