package BankSystem;

final class BankAccount {
    private double balance;

    public double getBalance() {
        return this.balance + (this.balance * 0.1);
    }

    public void setBalance(double balance) {
        if (balance > 0 && balance <= 1000000) {
            this.balance += balance;
        }
    }

    public void setBalance(double balance, double Tax_percent) {
        this.balance += balance - (balance * (Tax_percent / 100));
    }
}
