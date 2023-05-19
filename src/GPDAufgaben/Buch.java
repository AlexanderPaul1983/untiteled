package GPDAufgaben;

public class Buch {
    //                  Attributen
    private String Titel;
    private String Autor;
    private String ISBN;

    //                  Konstruktor


    public Buch(String titel, String autor, String ISBN) {
        Titel = titel;
        Autor = autor;
        this.ISBN = ISBN;
    }

    public String getTitel() {
        return Titel;
    }

    public String getAutor() {
        return Autor;
    }

    public String getISBN() {
        return ISBN;
    }
}
