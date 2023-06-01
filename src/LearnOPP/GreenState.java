package LearnOPP;

public class GreenState implements State {
    @Override
    public void next(TrafficLight trafficLight) {
        trafficLight.setState(new YellowState());
    }

    @Override
    public String getColor() {
        return "Green";
    }
}
