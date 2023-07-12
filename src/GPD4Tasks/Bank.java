package GPD4Tasks;

import java.util.ArrayList;
import java.util.List;

public class Bank extends BankKonto {
    private String nameOfBank;
    List<BankKonto> bankKontoList = new ArrayList<>();

    public Bank( String nameOfBank, int kontoNummer, String besitzer, double kontostand) {
        super(kontoNummer, besitzer, kontostand);
    }

    public String getNameOfBank() {
        return nameOfBank;
    }
    public void addBankKonto(BankKonto newKonto){
        bankKontoList.add(newKonto);
        System.out.println("Eine neue Bankkonto wurde zugefügt");
    }
    public void removeBankkonto(BankKonto Konto){
        if (bankKontoList.contains(Konto)){
            bankKontoList.remove(Konto);
            System.out.println("das Konto wurde gelöscht");
        }
        else {
            System.err.println("Das Konto ist nicht in der Liste, versuchen Sie es noch einmal!");
        }
    }
    public double getTotalBalace(){
    return getKontostand();
    }

}
