/*
    Main.java
    by: https://github.com/Yassineelg
    mail: yassineelgherrabi@gmail.com
    created: 19/07/2023
*/

package main;

import bank.BankAccount;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to the Basic Bank Account Application!");

        while (running) {
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
                        String accountHolder = "";
                        do {
                            System.out.print("Enter your name: ");
                            accountHolder = scanner.nextLine();

                            if (isAccountHolderExists(accountHolder)) {
                                System.out.println("Account holder already exists. Please choose another name.");
                                continue;
                            }
                        } while (isAccountHolderExists(accountHolder));

                        String password;
                        String confirmPassword = "";

                        do {
                            System.out.print("Enter your desired password: ");
                            password = scanner.nextLine();

                            if (password.length() < 6) {
                                System.out.println("Password must be at least 6 characters long. Try again.");
                                continue;
                            }

                            System.out.print("Confirm your password: ");
                            confirmPassword = scanner.nextLine();

                            if (!password.equals(confirmPassword)) {
                                System.out.println("Passwords do not match. Please try again.");
                            }
                        } while (password.length() < 6 || !password.equals(confirmPassword));

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
            } else {
                System.out.println("Invalid input. Please enter a valid integer choice.");
                scanner.nextLine();
            }
        }
        scanner.close();
    }

    private static boolean isAccountHolderExists(String accountHolder) {
        try {
            FileReader fileReader = new FileReader("accounts.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length >= 2 && data[1].equalsIgnoreCase(accountHolder)) {
                    bufferedReader.close();
                    return true;
                }
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}