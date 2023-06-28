package Softwareengineering;

public class Adapter implements AdapterInterface{
    private JSONprogramm closedDates;
    @Override
    public void showWeatherDates() {
        System.out.println("The Dates were " );

    }

    public JSONprogramm getClosedDates() {
        return closedDates;
    }

    public Adapter(JSONprogramm closedDates) {
        this.closedDates = closedDates;
        showWeatherDates();
    }
}
