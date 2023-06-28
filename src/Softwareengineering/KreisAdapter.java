package Softwareengineering;

public class KreisAdapter implements KreisberechnungInterface {
    private final Kreisberechnungen kreisberechnungen;

    @Override
    public double flaecheninhalt(Kreis k) {
        return kreisberechnungen.fleacheninhalt(k.getRadius());
    }

    @Override
    public double umfang(Kreis k) {
        return kreisberechnungen.umfang(k.getRadius());
    }

    public KreisAdapter() {
        this.kreisberechnungen = new Kreisberechnungen();
    }

    public static void main(String[] args) {
        Kreis k = new Kreis(4.0);
        KreisberechnungInterface berechnung = new KreisAdapter();
        System.out.println("Flächeninhalt: " + berechnung.flaecheninhalt(k));
        System.out.println("Umfang: " + berechnung.umfang(k));
    }
}
