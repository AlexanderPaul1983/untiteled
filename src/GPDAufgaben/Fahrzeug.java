package GPDAufgaben;

public class Fahrzeug {
    private static int anzahlFahrzeuge= 0;
    private int fahrzeugNummer;
    private String marke;
    private int geschwindichkeit;

    // Konstruktor
    Fahrzeug(int fahrzeugNummer, String marke){
        this.fahrzeugNummer=fahrzeugNummer;
        this.marke=marke;
        anzahlFahrzeuge++;
        geschwindichkeit=0;
    }

    // Methoden
    public void beschleunigen (int speed){
        geschwindichkeit+=speed;
        System.out.println("Das Fahrzeug wurde um "+ geschwindichkeit+ " km/h beschleunigt.");
    }
    public void bremsen(int stopen){
        geschwindichkeit-=stopen;
        System.out.println("Das Fahrzeug wurde um "+ geschwindichkeit+ " km/h abgebremst.");
    }


    public static int getAnzahlFahrzeuge(){
        System.out.println("Aktueller Stand der Fahrzeuge beträgt: ");
        return anzahlFahrzeuge;
    }
    // Getters and Setters


    public int getFahrzeugNummer() {
        return fahrzeugNummer;
    }
    public void setFahrzeugNummer(int fahrzeugNummer){
        this.fahrzeugNummer=fahrzeugNummer;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public int getGeschwindichkeit() {
        return geschwindichkeit;
    }

    public void setGeschwindichkeit(int geschwindichkeit) {
        this.geschwindichkeit = geschwindichkeit;
    }
}
