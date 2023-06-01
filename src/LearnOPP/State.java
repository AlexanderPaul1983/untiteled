package LearnOPP;

public interface State {
    void next(TrafficLight trafficLight);
    String getColor();
}
