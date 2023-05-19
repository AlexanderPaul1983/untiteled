package LearnOPP;

public class Hund extends Animal implements Lebewesen{
     private String beruf;



    //                       Konstruktor

    public Hund(String animalName, int foots, float animalAge, String beruf) {
        super(animalName, foots, animalAge);
        this.beruf =beruf;
    }

    //                   Methoden

    public static void bellen(){
        System.out.println("wuw-wuw");
    }

    @Override
    public void atmen() {
        System.out.println("ich schnarche");
    }
}
