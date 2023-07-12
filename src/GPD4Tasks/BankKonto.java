package GPD4Tasks;

public class BankKonto {
    private int kontoNummer;
    private String besitzer;

    private double Kontostand;

    public BankKonto(int kontoNummer, String besitzer, double kontostand) {
        this.kontoNummer = kontoNummer;
        this.besitzer = besitzer;
        Kontostand = kontostand;
        Kontostand++;
    }

    public int getKontoNummer() {
        return kontoNummer;
    }

    public void setKontoNummer(int kontoNummer) {
        this.kontoNummer = kontoNummer;
    }

    public String getBesitzer() {
        return besitzer;
    }

    public void setBesitzer(String besitzer) {
        this.besitzer = besitzer;
    }

    public double getKontostand() {
        return Kontostand;
    }

    public void setKontostand(double kontostand) {
        Kontostand = kontostand;
    }
}
