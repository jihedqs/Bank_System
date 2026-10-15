public class Main {
    public static void main(String[] args) {
        Account acc = new Account("A1", "Jihed Rezgani");

        acc.deposit(100);
        acc.withdraw(30);
        System.out.println(acc.getBalance());
        System.out.println(acc.getOwnerName());
    }
}
