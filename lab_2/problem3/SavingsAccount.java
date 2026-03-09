package problem3;

public class SavingsAccount extends Account {

    private double interestRate; // %

    public SavingsAccount(int accNumber, double interestRate){
        super(accNumber);
        this.interestRate = interestRate;
    }

    public void addInterest(){
        balance += balance * interestRate / 100.0;
    }

    @Override
    public String toString(){
        return "Savings " + accNumber + ", Balance: $" + balance + ", Interest Rate: " + interestRate + "%";
    }
}