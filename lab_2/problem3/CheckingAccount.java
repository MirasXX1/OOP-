package problem3;

//агымдагы есеп айындагы жасалган операциялар саны
public class CheckingAccount extends Account {
//акысыз оперциялар саны
    private int transactions;
    private final int FREE_TRANSACTIONS = 3;
//конс
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
        transactions = 0;
    }

    @Override
    public String toString(){
        return "Checking " + accNumber + ", Balance: $" + balance + ", Transactions: " + transactions;
    }
}