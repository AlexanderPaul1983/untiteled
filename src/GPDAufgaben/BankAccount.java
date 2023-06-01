package GPDAufgaben;

public class BankAccount {
    public float balance;

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
        System.out.println("You added to your balance: "+ getBalance());
    }

    public void toDeposit(float deposite) {
        this.balance = balance + deposite;
        System.out.println("You many are on your balance now!");
    }
    public void toWithdraw(float value){
        if (balance >= value){
            this.balance = balance - value;
            System.out.println("After withdrawing money from your balance you have: " + getBalance());

        }
         else System.err.println("It is not enough money on your balance");

    }
}

