package OOP2;

public class Cylinder extends Circle{
    private double height;
    public Cylinder(){
        super();
        height=1.00;
    }
    public Cylinder(double radius){
        super(radius);
    }
    public Cylinder(double radius, double height){
        super(radius);
        this.height=height;
    }
    public Cylinder(double radius, double height, String color){
        super(radius,color);
        this.height=height;
    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double getVolume(){
        return super.getArea()*height;
    }
    public double getArea(){
        return (4*Math.PI*getRadius()*height)+getArea();
    }
    public String toString(){
        return "Cylinder subclass of "+super.toString()+", height="+height;
    }
}
