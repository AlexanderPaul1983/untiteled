package GPDAufgaben;

public class Bankkonto {
    //                  Attributen
    private String Kontonamen;
    private float Kontostand =0;

    //                   konstruktor

    public Bankkonto (String Kontonamen, float Kontostand){
        this.Kontonamen = Kontonamen;
        this.Kontostand = Kontostand;
    }

    //                  Methoden


    public float getKontostand() {
        return Kontostand;
    }
    public void geldEinzahlen (float Einzahlung){
        Kontostand+=Einzahlung;
        System.out.println("Das Geld wurde erfolgreich auf ihr Konto in Höhe von "+ Einzahlung+" überwiesen!" );
    }

    public void GeldAbheben (float Abheben){
        if(Abheben>this.Kontostand){
            System.err.println("Nicht genug Geld auf dem Konto!");
        } else {
            this.Kontostand-= Abheben;
            System.out.println("Das Geld in Höhe von "+Abheben+ " wurde erfolgreich von ihrem Konto abgehoben" );
        }

    }


}
