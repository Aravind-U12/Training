class BankAccount {
    private final String accountNumber;
    private final String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double openingBalance) {
        if (openingBalance < 0) throw new IllegalArgumentException("Opening balance cannot be negative");
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = openingBalance;
    }

    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Deposit must be positive");
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Withdrawal must be positive");
        if (amount > balance) throw new IllegalArgumentException("Insufficient balance");
        balance -= amount;
    }

    public void displayBalance() {
        System.out.printf("%s (%s) balance: Rs. %.2f%n", holderName, accountNumber, balance);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("AC1001", "Maya", 5000);
        account.deposit(1500);
        account.withdraw(2000);
        account.displayBalance();
    }
}
