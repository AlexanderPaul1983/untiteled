package GPDAufgaben;

import java.util.ArrayList;

public class Bibliothek {
    private final ArrayList<Buch> BibliotheksLager;

//                      Konstruktor


    public Bibliothek(String bibliotheksname) {
        //                  Attributen
        BibliotheksLager = new ArrayList<Buch>();
    }

    public void addBook(Buch buch) {
        BibliotheksLager.add(buch);
        System.out.println("Ein neues Buch mit dem Namen: " + buch.getTitel() + " wurde hinzugefügt");
    }

    public void removeBook(Buch buch) {
        if (BibliotheksLager.contains(buch)) {
            BibliotheksLager.remove(buch);
            System.out.println("Ein neues Buch mit dem Namen: " + buch.getTitel() + " wurde entfernt");
        } else {
            System.out.println("Das buch mit dem Title " + buch + " ist nicht im Bibliothekslager vorhanden. ");


        }
    }
    public void showAllbooks (){
        if(BibliotheksLager.isEmpty()){
            System.out.println("Die Bibliothekslager ist zur Zeit leer, es sind keine Bücher vorhanden.");
        }else {
            for (Buch Bucher:BibliotheksLager
                 ) {

                System.out.println("Titel: "+ Bucher.getTitel()+ " Autor: " + Bucher.getAutor()+ " ISBN: "+ Bucher.getISBN());
            }
        }
    }
}


