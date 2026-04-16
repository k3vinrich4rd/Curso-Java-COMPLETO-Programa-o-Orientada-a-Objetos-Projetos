package herancaepolimorfismo.entities;

public class SavingsAccount extends Account {
    private Double interestHate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestHate) {
        super(number, holder, balance);
        this.interestHate = interestHate;
    }

    public Double getInterestHate() {
        return interestHate;
    }

    public void setInterestHate(Double interestHate) {
        this.interestHate = interestHate;
    }

    public void updateBalance() {
        balance += balance * interestHate;
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
    }
}
