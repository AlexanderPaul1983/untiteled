package LearnOPP;

import java.util.Objects;

public class TrafficLight {
    private State currentState;

    public TrafficLight(){
        currentState=new RedState();
    }

    public void  setState(State state){
        this.currentState=state;
    }
  public void change(){
        currentState.next(this);

  }
  public String getColor(){
        return currentState.getColor();
  }
}
