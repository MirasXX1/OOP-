package problem3;

public class CheckingAccount extends Account {

    private int transactions;
    private final int FREE_TRANSACTIONS = 3;

    public CheckingAccount(int accNumber){
        super(accNumber);
        this.transactions = 0;
    }

    @Override
    public void deposit(double sum){
        super.deposit(sum);
        transactions++;
    }

    @Override
    public void withdraw(double sum){
        super.withdraw(sum);
        transactions++;
    }

    public void deductFee(){
        if(transactions > FREE_TRANSACTIONS){
            double fee = (transactions - FREE_TRANSACTIONS) * 0.02;
            if(balance >= fee){
                balance -= fee;
            } else {
                System.out.println("Not enough balance for fee!");
            }
        }
        transactions = 0; // reset after fees
    }

    @Override
    public String toString(){
        return "Checking " + accNumber + ", Balance: $" + balance + ", Transactions: " + transactions;
    }
}