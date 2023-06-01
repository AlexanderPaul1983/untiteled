package LearnOPP;

public class GreenState implements State{
    @Override
    public void switchState() {
        System.out.println("Switching from Green to Yellow");
    }
}
