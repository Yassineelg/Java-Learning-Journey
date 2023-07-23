/*
    Main.java
    by: https://github.com/Yassineelg
    mail: yassineelgherrabi@gmail.com
    created: 19/07/2023
*/

package main;

import bank.BankAccount;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to the Basic Bank Account Application!");

        while(running) {
            System.out.println("Choose an option:");
            System.out.println("1. Create an account");
            System.out.println("2. Delete an account");
            System.out.println("3. Access an account");
            System.out.println("4. Exit");

            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter your name: ");
                        String accountHolder = scanner.nextLine();

                        System.out.print("Enter your desired password: ");
                        String password = scanner.nextLine();

                        BankAccount.createAccount(accountHolder, password);
                        break;

                    case 2:
                        // Delete an account
                        // Implement this part later

                        break;

                    case 3:
                        // Access an account
                        // Implement this part later

                        break;

                    case 4:
                        running = false;
                        break;

                    default:
                        System.out.println("Invalid choice. Please choose a valid option (1, 2, 3 or 4).");
                }
            }
            else {
                System.out.println("Invalid input. Please enter a valid integer choice.");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}
