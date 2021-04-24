package OOP2;

public class TestCylinder {
    public static void main(String[] args){
        Cylinder c1= new Cylinder();
        System.out.println("Cylinder: " +
                " radius="+ c1.getRadius() +
                " height=" + c1.getHeight() +
                "base area=" + c1.getArea() +
                "volume=" + c1.getVolume());

        Cylinder c2= new Cylinder(10.0);
        System.out.println(c2.getHeight());
        System.out.println(c2.getRadius());
        System.out.println(c2.getArea());
        System.out.println(c2.getVolume());

        Cylinder c3 = new Cylinder(2.0,8);

        System.out.println(c3);
        System.out.println(c3.getHeight());
        System.out.println(c3.getRadius());
        System.out.println(c3.getArea());
        System.out.println(c3.getVolume());
    }
}
