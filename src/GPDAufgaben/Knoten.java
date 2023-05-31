package GPDAufgaben;

public class Knoten<T> {
    private T daten;
    private int verweis;

    // Konstruktor

    public void add(){

    }
    public void remove(){

    }
    public  int getSize(){
        return this.getSize();
    }
public Knoten (T daten, int verweis){
        this.daten = daten;
        this.verweis = verweis;
}

    public T getDaten() {
        return daten;
    }

    public void setDaten(T daten) {
        this.daten = daten;
    }

    public int getVerweis() {
        return verweis;
    }

    public void setVerweis(int verweis) {
        this.verweis = verweis;
    }
}
