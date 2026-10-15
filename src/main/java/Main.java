public class Main {
    public static void main(String[] args){
        Account acc = new Account("A1","Jihed Rezgani");

        acc.setBalance(acc.getBalance()+599);
        System.out.println(acc.getOwnerName());
        System.out.println(acc.getBalance());
    }
}
