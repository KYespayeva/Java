package OOP2;

public class MyTriangle {
    MyPoint v1;
    MyPoint v2;
    MyPoint v3;

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public String toString() {
        return "MyTriangle[" + v1 + "=" + v1.toString() + "," + v2 + "=" + v2.toString() + "," + v3 + "=" + v3.toString() + "]";
    }

    public double getPerimeter() {
        return v1.distance(v2) + v1.distance(v3) + v2.distance(v3);
    }

    public String getType() {
        double p1 = v1.distance(v2);
        double p2 = v1.distance(v3);
        double p3 = v2.distance(v3);

        if (p1 == p2 && p2 == p3) {
            return "equilateral";
        } else if (p1 == p2 || p2 == p3 || p1 ==p3) {
            return "isosceles";
        } else {
            return "scalene";
        }
    }


}
