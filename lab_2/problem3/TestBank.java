package problem3;

//run
//javac problem3/*.java
//java problem3.TestBank

public class TestBank {

    public static void main(String[] args){

        Bank bank = new Bank();

        SavingsAccount s1 = new SavingsAccount(101, 5);
        CheckingAccount c1 = new CheckingAccount(201);

        s1.deposit(1000);
        c1.deposit(500);
        c1.withdraw(100);
        c1.withdraw(50);
        c1.withdraw(50);
        c1.withdraw(50); // fee should apply

        bank.addAccount(s1);
        bank.addAccount(c1);

        System.out.println("Before update:");
        bank.printAccounts();

        bank.updateAccounts();

        System.out.println("\nAfter update:");
        bank.printAccounts();
    }
}