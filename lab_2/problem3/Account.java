package problem3;

public class Account {

    protected double balance;
    protected int accNumber;

    public Account(int accNumber){
        this.accNumber = accNumber;
        this.balance = 0.0;
    }

    public void deposit(double sum){
        balance += sum;
    }

    public void withdraw(double sum){
        if(balance >= sum){
            balance -= sum;
        } else {
            System.out.println("Not enough balance!");
        }
    }

    public double getBalance(){ return balance; }

    public int getAccNumber(){ return accNumber; }

    public void transfer(double amount, Account other){
        if(balance >= amount){
            this.withdraw(amount);
            other.deposit(amount);
        } else {
            System.out.println("Not enough balance to transfer!");
        }
    }

    @Override
    public String toString(){
        return "Account " + accNumber + ", Balance: $" + balance;
    }

    public final void print(){
        System.out.println(toString());
    }
}