package sources;

public class Circle extends GeometricObject{
    private double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }
    
    public Circle() {
        super();
        radius =0;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getDiameter(){
        return 2*radius;
    }

    @Override
    public double getArea() {
        return (Math.PI*Math.pow(radius,2));
    }

    @Override
    public double getPerimeter() {
        return ((Math.PI)*getDiameter());
    }
}