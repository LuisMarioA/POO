package sources;

import java.text.DecimalFormat;
import java.util.Date;

public abstract class GeometricObject {
    private String color;
    private boolean filled;
    private Date dataCreated;
    DecimalFormat df = new DecimalFormat("0.00"); 

    protected GeometricObject() {
        color="Blue";
        filled=true;
        dataCreated= new Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    } 

    public boolean isFilled(){
        return filled;
    }
    
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    
    public Date getDataCreated() {
        return dataCreated;
    }

    @Override
    public String toString() {
        return "GeometricObject{" + "color=" + color + ", filled=" + filled + ", dataCreated=" 
                + dataCreated + " Area=" +df.format(getArea()) + " Perimeter="+ df.format(getPerimeter()) +'}';
    }
    
    public abstract double getArea();
    public abstract double getPerimeter();
}