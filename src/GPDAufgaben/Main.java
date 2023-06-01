package GPDAufgaben;

import LearnOPP.GreenState;
import LearnOPP.TrafficLight;
import LearnOPP.YellowState;

public class Main {
    public static void main(String[] args) {

        TrafficLight trafficLight = new TrafficLight();
        for (int i = 0; i <9; i++) {
            System.out.println(trafficLight.getColor());
            trafficLight.change();

        }








    }
}
