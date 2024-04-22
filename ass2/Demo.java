import java.util.Scanner;

class BankAccount {
    private String accountHolderName;
    private long accountNumber;
    private char accountType; 
    private double balance;
    public BankAccount() {
    }
    public void setData(String accountHolderName, long accountNumber, char accountType, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }
    public void withdrawMoney(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. Updated balance: $" + balance);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }
    public void depositMoney(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Updated balance: $" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void displayData() {
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + (accountType == 'S' ? "Savings" : "Current"));
        System.out.println("Balance: $" + balance);
    }
}

public class Demo{
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        account1.setData("Tejas Advik", 123456789, 'S', 1000.0);
        account2.setData("Marmik Aggarwal", 987654321, 'C', 2000.0);
        System.out.println("Account 1 Information:");
        account1.displayData();

        System.out.println("\nAccount 2 Information:");
        account2.displayData();
    }
}