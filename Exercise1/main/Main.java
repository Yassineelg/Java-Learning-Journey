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

        System.out.print("Enter your name: ");
        String accountHolder = scanner.nextLine();

        System.out.print("Enter your account number: ");
        int accountNumber = scanner.nextInt();

        BankAccount bankAccount = new BankAccount(accountNumber, accountHolder, 1000.0);
        System.out.println("Account Number: " + bankAccount.getAccountNumber());
        System.out.println("Account Holder: " + bankAccount.getAccountHolder());
        System.out.println("Balance: " + bankAccount.getBalance());

        scanner.close();
    }
}