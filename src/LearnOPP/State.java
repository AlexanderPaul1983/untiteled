package LearnOPP;

public class State{
    private String redColor = "red";
    private String greenColor = "green";

    public String getRedColor() {
        return redColor;
    }

    public State(String redColor) {
        this.redColor = redColor;
    }

    public void setRedColor(String redColor) {
        this.redColor = redColor;
    }

    public String getGreenColor() {
        return greenColor;
    }

    public void setGreenColor(String greenColor) {
        this.greenColor = greenColor;
    }
}
