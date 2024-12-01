package org.example.Account;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a sample account
        Account account = new Account("John Doe", "123456789", 500.00);
        System.out.println("Account created successfully!");
        account.displayAccountInfo();

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Account Info");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1: // Deposit
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 2: // Withdraw
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawalAmount = scanner.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;

                case 3: // Display Account Info
                    account.displayAccountInfo();
                    break;

                case 4: // Exit
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please select a valid operation.");
            }
        }
    }
}
