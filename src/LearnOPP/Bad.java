package LearnOPP;

public class Bad extends Animal{

    //              Attributen
    private String fluegeln;
    public Bad(String animalName, int foots, float animalAge, String fluegeln) {
        super(animalName, foots, animalAge);
        this.fluegeln = fluegeln;
    }
    //            Methode

    public void fliegen (){
        System.out.println("ich fliege!!");
    }

    @Override
    public int bewegen(int step) {
        return step++;
    }
    public String bewegen (int step, int yAchse){
        int step1 = step+1;
        int yAchse1 = yAchse+1;
        String koordinaten = "(" + step1 + ", "+ yAchse1 + ")";
        return koordinaten;
    }
}
