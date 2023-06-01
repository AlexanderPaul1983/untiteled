package GPDAufgaben;

public class Main {
    public static void main(String[] args) {

    BankAccount bankAccount = new BankAccount();
    bankAccount.setBalance(200f);
    bankAccount.toDeposit(200f);
        System.out.println(bankAccount.getBalance());

        bankAccount.toWithdraw(400f);







    }
}
