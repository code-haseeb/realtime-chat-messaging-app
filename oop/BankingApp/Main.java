package BankingApp;

class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest);
        System.out.println("Interest applied: $" + interest);
    }

    private double getBalance() {
        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a SavingsAccount object
        SavingsAccount mySavingsAccount = new SavingsAccount("SA12345", 1000.0, 0.03); // 3% annual interest rate

        // Perform transactions and display account information
        mySavingsAccount.displayAccountInfo();
        mySavingsAccount.deposit(500.0);
        mySavingsAccount.withdraw(200.0);
        mySavingsAccount.applyInterest(); // Apply monthly interest
        mySavingsAccount.displayAccountInfo();
    }
}
