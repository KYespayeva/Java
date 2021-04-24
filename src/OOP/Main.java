package OOP;

public class Main {
    public static void main(String[] args){
        Circle c1 = new Circle();
        System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea());
        Circle c2 = new Circle(2.0);
        System.out.println("The circle has radius of " + c2.getRadius() + " and area of " + c2.getArea());
        Circle c3 = new Circle(3.0 , "blue");
        System.out.print("The circle has radius of " + c3.getRadius() + " and color is " + c3.getColor());


        Circle c4 = new Circle();
        c4.setRadius(5.5);
        System.out.println("radius is: " + c4.getRadius());
        c4.setColor("green");
        System.out.println("color is: " + c4.getColor());

       // System.out.println(c1.radius); access only with public value
        Circle c5 = new Circle();
        System.out.println(c5.toString());

        Circle c6 = new Circle(6.6);
        System.out.println(c6.toString());
        System.out.println(c6);
        System.out.println("Operator '+' also calls toString ():" + c6);

        Circle2 c7 = new Circle2();
        System.out.println(c7.getRadius());
        Circle2 c8 = new Circle2(5.0);
        System.out.println(c8.getRadius());
        Circle2 c9 = new Circle2(3.5);
        System.out.println(c9.getRadius());
        Circle2 c10 = new Circle2();
        c10.setRadius(4.0);
        System.out.println(c10.getRadius());
        Circle2 c11 = new Circle2();
        System.out.println(c11.getArea());

        Circle2 c12 = new Circle2();
        System.out.println("Circumference "+c12.getCircumference());


        Circle2 c13 = new Circle2(4.0);
        System.out.println(c13.toString());


        Rectangle r1 = new Rectangle();
        System.out.println(r1.getLength() + " " + r1.getWidth());
        Rectangle r2 = new Rectangle(2 ,3);
        System.out.println(r2.getLength() + " " + r2.getWidth());
        System.out.println("Area is: " + r2.getArea() + " and Perimeter is: " + r2.getPerimeter());
        System.out.println(r2.toString());


        Employee e1 = new Employee(1 , "Karlygash" , "Yespayeva" , 200000 );

        System.out.println(e1.toString());
        e1.raiseSalary(2);
        System.out.println(e1.toString());
        System.out.println("Annual salary is:" + e1.getAnnualSalary());


    }
}
