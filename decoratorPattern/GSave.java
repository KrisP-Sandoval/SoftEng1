package SoftEng1.decoratorPattern;

public class GSave implements BankAccountDecorator {
    private BankAccount bankAccount;

    public GSave(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String showInfo() {
        return bankAccount.showInfo();
    }

    @Override
    public String showAccountType() {
        return "GSave Account";
    }

    @Override
    public double getInterestRate() {
        return 0.025;
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
        return bankAccount.showBenefits() + ", GCash transfer.";
    }

    @Override
    public void setBankAccount(BankAccount bankAccount) {

    }
}
