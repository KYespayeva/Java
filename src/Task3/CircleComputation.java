package Task3;
import java.util.Scanner;
public class CircleComputation {
    public static void main(String[] args) {
        double radius, diameter, circumference, area;
        Scanner in = new Scanner(System.in);
        System.out.print("Type radius");
        radius = in.nextDouble();
        diameter = 2.0 * radius;
        area = Math.PI * radius * radius;
        circumference = 2.0 * Math.PI * radius;
        System.out.println("Diameter is:" + diameter);
        System.out.println("Area is:" + area);
        System.out.println("Circumference is:" + circumference);
    }
}
