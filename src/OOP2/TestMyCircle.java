package OOP2;

public class TestMyCircle {
    public static void main(String[] args){

        MyCircle circle = new MyCircle(2,4, 5);
        System.out.println(circle);

        MyCircle circle2 = new MyCircle(3,5,6);

        System.out.println("Radius is " + circle2.getRadius() + " and area is " + circle2.getArea());

    }
}
