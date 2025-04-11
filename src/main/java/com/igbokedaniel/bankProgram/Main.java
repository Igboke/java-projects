package main.java.com.igbokedaniel.bankProgram;

import java.util.Scanner;

public class Main {
    //program will accept input from user in different methods
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        boolean isRunning = true;
        int choice;
        double balance=0;
        //list the things the program will do, there must be a while loop
        while (isRunning) {
            System.out.println();
            System.out.println("******************************");
            System.out.println("WELCOME TO THE BANK OF IGBOKE");
            System.out.println("******************************");
            System.out.println();
            System.out.println("1. Display Balance");
            System.out.println("2. Deposit Funds");
            System.out.println("3. Withdraw Funds");
            System.out.println("4. Exit App");
            System.out.println();
            
            System.out.print("Enter Choice (1,2,3,4): ");

            while (true) {
                try {
                    choice = scanner.nextInt();
                    break;
                } catch (java.util.InputMismatchException e) {
                    System.out.print("Enter an Integer: ");
                    scanner.next();
                }    
            }
            switch (choice) {
                case 1:displayBalance(balance); break;
                case 2:balance+=depositFunds(); break;
                case 3:balance = withdrawFunds(balance); break;
                case 4:isRunning=false; break;
            
                default: System.out.println("Enter Integers within the Required range"); break;
            }
            System.out.println();
            
        }
        scanner.close();
        
    }
    static void displayBalance(double balance){
        System.out.printf("Your balance is %.2f\n",balance);
    }
    static double depositFunds(){
        double deposit;
        while (true) {
            try {
                System.out.print("Enter amount to be deposited: ");
                deposit = scanner.nextDouble();
                break;    
            } catch (java.util.InputMismatchException e) {
                System.out.print("Enter a valid deposit");
                scanner.next();
            }    
        }
        if (deposit < 0) {
           System.out.println("Deposot cannot be less than 0"); 
           return 0;
        }
        else{
            return deposit;
        }
        
    }
    static double withdrawFunds(double balance){
        double funds = 0;
        try {
            System.out.print("Enter amount to withdraw: ");
            funds = scanner.nextDouble();
        } catch (java.util.InputMismatchException e) {
            scanner.next();
            System.out.println("Enter a valid integer");
        }
        if (funds > balance) {
            System.out.println("Insufficient Balance");
            return balance;
        }
        else if (funds < 0){
            System.out.println("Amount to be withdrawn must be greater than 0");
            return balance;
        }
        else{
            balance -= funds;
            return balance;
        }

    }
}

