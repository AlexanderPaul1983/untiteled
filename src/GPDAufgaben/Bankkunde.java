package GPDAufgaben;

public class Bankkunde {
    //                  Attributen
    private String Kundenname;
    private Bankkonto[] bankkonten;


    //             Konstruktor


    public Bankkunde(String kundenname, Bankkonto[] bankkonten) {
        Kundenname = kundenname;
        this.bankkonten = bankkonten;


    }

    //                     Methoden

    // Methode die es Kunden erlaubt auf ein bestimmtes Bankkonto Geld einzuzahlen

    public void geldEinzahlen(int kontoindex, float einzahlung){
        if(kontoindex>=0 && bankkonten.length<kontoindex){
            bankkonten[kontoindex-1].geldEinzahlen(einzahlung);

        } else {
            System.err.println("Das Konto mit Index "+ kontoindex+ " existiert nicht!. Versuchen Sie es nochmal.");
        }

    }

    public void  geldAbheben (int kontoindex, float abheben){

        if(kontoindex>=0 && bankkonten.length<kontoindex){
            bankkonten[kontoindex-1].GeldAbheben(abheben);
            System.out.println("Das Geld wurde erfolgreich von ihrem Konto"+ kontoindex+" abgehoben!" );


        } else {
            System.err.println("Das Konto mit Index "+ kontoindex+ " existiert nicht!. Versuchen Sie es nochmal.");

        }

    }
    public float getgesamtStand (){
        float gesamtKontostand =0;
        for (Bankkonto gesamt: bankkonten
             ) {gesamtKontostand += gesamt.getKontostand();


        }
        System.out.println("Ihr gesamter Kontostand beträgt: ");
        return gesamtKontostand;
    }
//                         Getters und Setters
    public String getKundenname() {
        return Kundenname;
    }

    public void setKundenname(String kundenname) {
        Kundenname = kundenname;
    }

    public Bankkonto[] getBankkonten() {
        return bankkonten;
    }

    public void setBankkonten(Bankkonto[] bankkonten) {
        this.bankkonten = bankkonten;
    }
}
