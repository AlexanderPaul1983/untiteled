package LearnOPP;

public class YellowState implements State{

    @Override
    public void next(TrafficLight trafficLight) {
        trafficLight.setState(new RedState());
    }

    @Override
    public String getColor() {
        return "Yellow";
    }
}
