package problem3;

import java.util.Vector;

public class Bank {

    private Vector<Account> accounts;

    public Bank(){
        accounts = new Vector<>();
    }

    public void addAccount(Account acc){
        accounts.add(acc);
    }

    public void removeAccount(Account acc){
        accounts.remove(acc);
    }

    public void updateAccounts(){
        for(Account acc : accounts){
            if(acc instanceof SavingsAccount){
                ((SavingsAccount) acc).addInterest();
            } else if(acc instanceof CheckingAccount){
                ((CheckingAccount) acc).deductFee();
            }
        }
    }

    public void printAccounts(){
        for(Account acc : accounts){
            acc.print();
        }
    }
}