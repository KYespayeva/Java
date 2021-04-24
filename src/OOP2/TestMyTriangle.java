package OOP2;

public class TestMyTriangle {
    public static void main(String args[]){
        MyTriangle t1 = new MyTriangle(2,1, 4,4, 6,1);
        System.out.println(t1);
        System.out.println("Type is:" + t1.getType() + " and P=" + t1.getPerimeter());

        MyTriangle t2 = new MyTriangle(1,1,  3,5,  6,2);
        System.out.println(t2);
        System.out.println("Type is:" + t2.getType() + " and P=" + t2.getPerimeter());

        MyTriangle t3 = new MyTriangle(5,1,  5,4 , 5 ,2);
        System.out.println(t3);
        System.out.println("Type is:" + t3.getType() + " and P=" + t3.getPerimeter());
    }
}
