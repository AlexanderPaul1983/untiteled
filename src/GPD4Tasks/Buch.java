package GPD4Tasks;

public class Buch {

    private String title;
    private String author;
    private int pageCount;
    private  double price;

    // getTitle(): Diese Methode gibt den Titel des Buches zurück.
    //    getAuthor(): Diese Methode gibt den Autor des Buches zurück.
    //    getPageCount(): Diese Methode gibt die Anzahl der Seiten im Buch zurück.
    //    getPrice(): Diese Methode gibt den Preis des Buches zurück.
    //    displayInfo(): Diese Methode gibt die Informationen des Buches aus, einschließlich Titel, Autor, Seitenanzahl und Preis.


    public Buch(String title, String author, int pageCount, double price) {
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public double getPrice() {
        return price;
    }
    public void displayInfo(){
        System.out.println("Die Informationen über das Buch " + getTitle()+ ". Author: " + getAuthor()+
                ". Anzahl der Seiten ist " +getPageCount()+ ". Der Preis beträgt " + getPrice());
    }
}
