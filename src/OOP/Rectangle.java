package OOP;

import java.text.StringCharacterIterator;

public class Rectangle {
    private float length;
    private float width;
    public Rectangle(){
        length = 1.0f;
        width = 1.0f;
    }
    public Rectangle(float l , float w){
        length = l;
        width = w;
    }
    public float getLength(){
        return length;
    }
    public void setLength(float newLength){
        this.length = newLength;
    }
    public float getWidth(){
        return  width;
    }
    public void setWidth(float newWidth){
        this.width = newWidth;
    }
    public double getArea(){
        return width*length;
    }
    public double getPerimeter(){
        return (width+length)*2;
    }
    @Override
    public String toString(){
        return "Rectangle[length= " + length + ", width= " + width + "]";
    }
}
