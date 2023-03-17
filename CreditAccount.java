package Account;
public class CreditAccount extends Account {
    private Double accountLimit;


    public CreditAccount(String accountNumber, Double accountBalance, BankClient bankClient, Bank bank){
        super(accountNumber, accountBalance, bankClient, bank);
        if(bankClient.getAge()<18) {
            this.accountLimit = 0.0;
            return;}
        this.accountLimit = 10000.0;
    }
    public Double getAccountLimit() {
        return accountLimit;
    }

    public void setAccountLimit(Double accountLimit) {
        this.accountLimit = accountLimit;
    }

    @Override
    public String toString() {
        return "Credit Account{" +
                "accountLimit=" + accountLimit +
                '}';
    }
    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        System.out.println("Commission of credit is 10% and you will get an amount that is less 10% and " + (amount - (amount * 0.1)));
    }
}

