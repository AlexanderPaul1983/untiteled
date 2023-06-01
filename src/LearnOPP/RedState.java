package LearnOPP;

public class RedState implements State {

    @Override
    public void switchState() {
        System.out.println("Switching from Red to Green");
    }
}
