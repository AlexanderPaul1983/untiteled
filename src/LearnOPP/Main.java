package LearnOPP;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Kontos konto2 = new Kontos();
        konto2.createKonto("Kontonummer: 34");
        BankofEngland bank1 = new BankofEngland("Firstbank",54,konto2);
        System.out.println(bank1.getKonto());
    }
}
