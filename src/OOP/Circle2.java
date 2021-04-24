package OOP;

public class Circle2 {
    private double radius;
    public Circle2(){
        radius = 1.0;
    }
    public Circle2(double r){
        radius = r;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double newRadius){
        this.radius = newRadius;
    }
    public double getArea(){
        return radius*radius*Math.PI;
    }
    public double getCircumference(){
        return 2*radius*Math.PI;
    }
    @Override
    public String toString(){
        return "Circle[radius= " + radius + " ]";
    }
}
