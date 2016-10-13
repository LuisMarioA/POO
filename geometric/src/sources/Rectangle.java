package sources;

public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle() {
        super();
        width=0;
        height=0;
    }

    public Rectangle(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    
    @Override
    public double getArea(){
        return height*width;
    }

    @Override
    public double getPerimeter() {
         return 2*(height+width);
    }
}
