package GPDAufgaben;

public class Main {
    public static void main(String[] args) {

        Fahrzeug audi = new Fahrzeug(15,"Audi");
        Fahrzeug bmw = new Fahrzeug(16,"BMW");
        Fahrzeug WV = new Fahrzeug(45,"WV");
        audi.beschleunigen(120);
        System.out.println(audi.getGeschwindichkeit());
        System.out.println(Fahrzeug.getAnzahlFahrzeuge());
        







    }
}
