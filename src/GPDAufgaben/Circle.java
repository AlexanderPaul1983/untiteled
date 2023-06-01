package GPDAufgaben;

public class Circle extends  Shape{

    private double radius;

    @Override
    public double calculateArea() {
        return radius*Math.PI*radius;

    }
    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
