package LearnOPP;

public class YellowState implements State{
    @Override
    public void switchState() {
        System.out.println("Switching from Yellow to Red");
    }
}
