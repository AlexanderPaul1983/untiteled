package LearnOPP;

public class Animal implements Lebewesen{

    //                           Attributen:
 private int foots;
 private String animalName;
 private float animalAge;
 private static int counter = 0;

 //                              Konstruktor

    public Animal (String animalName, int foots, float animalAge){
        this.animalName = animalName;
        this.foots = foots;
        this.animalAge = animalAge;
        counter++;
        System.out.println("Hello ich bin ein Animal");
    }

    //                           Getters und Setters

    public int getFoots(){
        return foots;
    }
    public String getAnimalName(){
        return animalName;
    }
    public float getAnimalAge(){
        return animalAge;
    }

    public void setFoots(int foots) {
        this.foots = foots;
    }
    public void setAnimalName(String animalName){
        this.animalName=animalName;
    }

    public void setAnimalAge(float animalAge) {
        this.animalAge = animalAge;
    }


    //                    Methoden



    public static int getCounter() {
        return counter;
    }

    public void leben (){
        System.out.println("Ich lebe!!");

    }
    public int bewegen (int step) {
        return step+=2;
    }

    @Override
    public void atmen() {
        System.out.println("ich atme!!");
    }
}
