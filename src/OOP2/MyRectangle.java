package OOP2;

public class MyRectangle {
     MyPoint r1;
     MyPoint r2;


     public MyRectangle(int x1, int y1, int x2, int y2){
         this.r1 = new MyPoint(x1,y1);
         this.r2 = new MyPoint(x2,y2);
     }
    public MyRectangle(MyPoint r1, MyPoint r2) {
        this.r1 = r1;
        this.r2 = r2;
    }

    public String getPerimeter(){
         int a = r1.getY() - r2.getY();
         int b = r2.getX() - r1.getY();
         int p = 2*a*b;
         return p +"";
    }

    public String toString(){
        return "MyRectangle["+r1+"="+","+r2+"="+r2.toString()+"]";
    }
}
