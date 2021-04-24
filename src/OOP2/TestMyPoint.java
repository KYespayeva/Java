package OOP2;

public class TestMyPoint {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(3,4);
        System.out.println(p1.distance(5, 6));

        MyPoint p2 = new MyPoint(5,6);
        System.out.println(p1.distance(p2));

        System.out.println(p1.distance());

        MyPoint p3 = new MyPoint();
        System.out.println(p3);
        p3.setX(8);
        p3.setY(6);
        System.out.println("x is: "+ p3.getX());
        System.out.println("y is: "+p3.getY());
        p3.setXY(3,0);
        System.out.println(p3.getXY()[0]);
        System.out.println(p3.getXY()[1]);
        System.out.println(p3);

        MyPoint p4 = new MyPoint(0,4);
        System.out.println(p4);
        System.out.println("distance is: " + p3.distance(p4));
        System.out.println("distance is: " + p4.distance(p3));
        System.out.println(p3.distance(5,6)); // another
        System.out.println(p3.distance());

        MyPoint[] points = new MyPoint[5];
        for (int i = 0; i < points.length; i++){
            points[0] = new MyPoint(1, 1);
            points[1] = new MyPoint(2, 3);
            points[2] = new MyPoint(3, 5);
            points[3] = new MyPoint(4, 3);
            points[4] = new MyPoint(5, 4);

            System.out.println(points[i]);
        }



    }
}
