import java.util.Scanner;
class BankAccount{
    private String accountHolderName;
    private long accountNumber;
    private char accountType; // 'S' for savings, 'C' for current
    private double balance;

    public BankAccount(String accountHolderName, long accountNumber, char accountType, double balance) {
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

    public void displayAccountInfo() {
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + (accountType == 'S' ? "Savings" : "Current"));
        System.out.println("Balance: $" + balance);
    }
    public static void main(String[] args) {
        
        BankAccount myAccount = new BankAccount("Tejas Advik", 123456789, 'S', 1000.0);    
        System.out.println("Initial Account Information:");
        myAccount.displayAccountInfo();
        myAccount.depositMoney(500.0);
        myAccount.withdrawMoney(200.0);
        System.out.println("\nUpdated Account Information:");
        myAccount.displayAccountInfo();
    }
}