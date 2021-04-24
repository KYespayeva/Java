package OOP2;

public class TestMyRectangle {
    public static void main(String[] args) {
        MyRectangle rec = new MyRectangle(1, 2, 3, 2);
        System.out.println(rec);
        System.out.println("P=" + rec.getPerimeter());
    }
}
