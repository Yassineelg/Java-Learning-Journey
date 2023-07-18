/*
    Main.java
    by: https://github.com/Yassineelg
    mail: yassineelgherrabi@gmail.com
    created: 19/07/2023
*/

package main;

import bank.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(123456789, "Bob TheBuilder", 1000.0);

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Balance: " + account.getBalance());
    }
}