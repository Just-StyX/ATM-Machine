package atmMachine;

public class Account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private java.util.Date dateCreated;

    Account() {
    }

    Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dateCreated = new java.util.Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return this.annualInterestRate / (12.0 * 100.0);
    }

    public double getMonthlyInterest() {
        return this.balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        this.balance = this.balance - amount;
    }

    public void deposite(double amount) {
        this.balance = this.balance + amount;
    }
}
