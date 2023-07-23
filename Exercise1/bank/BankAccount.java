/*
    BankAccount.java
    by: https://github.com/Yassineelg
    mail: yassineelgherrabi@gmail.com
    created: 19/07/2023
*/

package bank;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getters and setters
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void createAccount(String accountHolder, String password) {
        Random random = new Random();
        int accountNumber = random.nextInt(90000000) + 10000000;
        double balance = 0.00;

        try {
            FileWriter writer = new FileWriter("accounts.txt", true);
            writer.write(accountNumber + "," + accountHolder + "," + password + "," + balance + "\n");
            writer.close();
            System.out.println("Account created successfully! Your account number is: " + accountNumber);
        } catch (IOException e) {
            System.out.println("An error occurred while saving the account information.");
        }
    }
}