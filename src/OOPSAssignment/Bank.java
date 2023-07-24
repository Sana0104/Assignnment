package OOPSAssignment;

class Account {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public double calculateTotalCash() {
        return balance;
    }
}

class SavingAccount extends Account {
    private double fixedDeposit;

    public SavingAccount(double balance, double fixedDeposit) {
        super(balance);
        this.fixedDeposit = fixedDeposit;
    }

    @Override
    public double calculateTotalCash() {
        return super.calculateTotalCash() + fixedDeposit;
    }
}

class CurrentAccount extends Account {
    private double cashCredit;

    public CurrentAccount(double balance, double cashCredit) {
        super(balance);
        this.cashCredit = cashCredit;
    }

    @Override
    public double calculateTotalCash() {
        return super.calculateTotalCash() + cashCredit;
    }
}

public class Bank {
    public static void main(String[] args) {
        Account savingAccount = new SavingAccount(50000, 10000);
        Account currentAccount = new CurrentAccount(30000, 5000);


        double totalCashInBank = savingAccount.calculateTotalCash() + currentAccount.calculateTotalCash();

        System.out.println("Total Cash in the Bank: " + totalCashInBank);
    }
}