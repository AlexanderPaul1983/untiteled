package GPDAufgaben;

public class Rectangle extends Shape{
    private double Site_a;
    private double Site_b;
    @Override
    public double calculateArea() {
        return Site_a * Site_b;
    }

    public Rectangle(double site_a, double site_b) {
        Site_a = site_a;
        Site_b = site_b;
    }

    public double getSite_a() {
        return Site_a;
    }

    public void setSite_a(double site_a) {
        Site_a = site_a;
    }

    public double getSite_b() {
        return Site_b;
    }

    public void setSite_b(double site_b) {
        Site_b = site_b;
    }
}
