package SoftEng1.decoratorPattern;

public class UpSave implements BankAccountDecorator {
    private BankAccount bankAccount;

    public UpSave(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String showInfo() {
        return bankAccount.showInfo();
    }

    @Override
    public String showAccountType() {
        return "UpSave Account";
    }

    @Override
    public double getInterestRate() {
        return 0.04;
    }

    @Override
    public double getBalance() {
        return bankAccount.getBalance();
    }

    @Override
    public double computeBalanceWithInterest() {
        return bankAccount.getBalance() * (1 + bankAccount.getInterestRate());
    }

    @Override
    public String showBenefits() {
        return bankAccount.showBenefits() + ", With Insurance.";
    }

    @Override
    public void setBankAccount(BankAccount bankAccount) {

    }
}
