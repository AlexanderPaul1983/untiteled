package LearnOPP;

import java.util.Objects;

public class TrafficLight {
    private State currentState;

    public TrafficLight(){
        currentState=new RedState();
    }

    public void  setState(State state){
        currentState=state;
    }
    public void switchState(){
       if(Objects.equals(currentState, new RedState())){
           currentState= new YellowState();
       }
        else {
            currentState= new GreenState();
       }
    }
}
