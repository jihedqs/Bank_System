public class Account {
    private final String ownerName;
    private final String id;
    private double balance;

    public Account(String id, String ownerName) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("Id cannot be empty");
        }
        if (ownerName == null || ownerName.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.id = id;
        this.ownerName = ownerName;
        this.balance = 0;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit must be positive");
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal must be positive");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Not enough money");
        }
        balance -= amount;
    }
}
