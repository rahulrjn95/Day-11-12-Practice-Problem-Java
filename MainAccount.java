package com.bridgelabz;

import java.util.Scanner;

public class MainAccount {
    public static void main(String[] args)
    {
        Account account1 = new Account(50.00);
        Account account2 = new Account(80.00);
        System.out.printf("Account 1 balance: $%.2f\n",account1.getBalance());
        System.out.printf("Account 2 balance: $%.2f\n\n",account2.getBalance());
        Scanner input = new Scanner(System.in);
        double withdrawAmount;
        System.out.println("Enter debit amount for Account 1:");
        withdrawAmount = input.nextDouble();
        System.out.printf("\ndeducting %.2f from Account 1 balance\n\n",withdrawAmount);
        account1.debit(withdrawAmount);
        System.out.printf("account1 balance: $%.2f\n",account1.getBalance());
        System.out.printf("account2 balance: $%.2f\n\n",account2.getBalance());
        System.out.println("Enter withdraw amount for Account 2:");
        withdrawAmount = input.nextDouble();
        System.out.printf("\ndeducting %.2f from Account 2 balance\n\n",withdrawAmount);
        account2.debit(withdrawAmount);
        System.out.printf("account1 balance: $%.2f\n",account1.getBalance());
        System.out.printf("account2 balance: $%.2f\n\n",account2.getBalance());
    }
}
