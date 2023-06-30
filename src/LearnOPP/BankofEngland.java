package LearnOPP;

public class BankofEngland {
    String name;
    int idNummer;
    Kontos konto;

    public BankofEngland(String name, int idNummer, Kontos konto) {
        this.name = name;
        this.idNummer = idNummer;
        this.konto = konto;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNummer() {
        return idNummer;
    }

    public void setIdNummer(int idNummer) {
        this.idNummer = idNummer;
    }

    public Kontos getKonto() {
        return konto;
    }

    public void setKonto(Kontos konto) {
        this.konto = konto;
    }
}
