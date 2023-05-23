package GPDAufgaben;

public class Main {
    public static void main(String[] args) {

        Bibliothek bibliothek = new Bibliothek("Stadtsbibliothek");
        Buch buch1 = new Buch("Harry Potter","Stein", "httr12345");
        Buch buch2 = new Buch("Der Kleine Prinz","Josef","djhf834726");
        bibliothek.addBook(buch1);
        bibliothek.addBook(buch2);
        bibliothek.showAllbooks();







    }
}
