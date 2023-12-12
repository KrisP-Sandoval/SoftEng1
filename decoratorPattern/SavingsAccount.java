package SoftEng1.decoratorPattern;

public class SavingsAccount implements BankAccount {
    public int accountNumber;
    public String accountName;
    public double balance;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    @Override
    public String showInfo() {
        return "Account Number: " + accountNumber + "\nAccount Name: " + accountName + "\nBalance: $" + balance;
    }

    @Override
    public String showAccountType() {
        return "Standard Savings Account";
    }

    @Override
    public double getInterestRate() {
        return 0.01;
    }

    @Override
    public double getBalance() {
        return 0;
    }

    @Override
    public double computeBalanceWithInterest() {
        return balance * (1 + getInterestRate());
    }

    @Override
    public String showBenefits() {
        return "Standard Savings Account";
    }

}
