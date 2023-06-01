package LearnOPP;

public class RedState implements State {


    @Override
    public void next(TrafficLight trafficLight) {
        trafficLight.setState(new GreenState());
    }

    @Override
    public String getColor() {
        return "Red";
    }
}
