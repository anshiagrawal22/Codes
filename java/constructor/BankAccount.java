// 2. create a bank account class with a private variable balance to store the account balance implement a public method deposit (double amount) to add funds . a protected method withdraw (double account ) to withdraw funds and default accur method checkbalance() to check balance .create an object of the class to display which method and vectors can be assured both outside and inside class
class BankAccount {
    private double accountbalance;

    BankAccount(double accountbalance) {
        this.accountbalance = accountbalance;
    }
    public void deposit(double amount) {
        accountbalance = accountbalance + amount;
    }
    protected void withdraw(double amount) {
        if (amount <= accountbalance) {
            accountbalance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
    public void checkBalance() {
        System.out.println("Balance: " + accountbalance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount(10000);
        acc.deposit(2300);
        acc.withdraw(2100);
        acc.checkBalance();
    }
}