package LearnOPP;

public class Nebenampel extends Traficlight{
    @Override
    public String switchcolor() {
        State ampelH = new State("green");
        System.out.println("Der Ampel ist auf grün");
        return "green";
    }
}
