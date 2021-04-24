package OOP2;

import java.util.Arrays;

public class Book2 {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book2(String name, Author[] authors, double price){
        this.name=name;
        this.authors=authors;
        this.price=price;
    }

    public Book2(String name,Author[] authors, double price, int qty){
        this.name = name;
        this.price = price;
        this.qty = qty;
        this.authors= authors;

    }

    public Author[] getAuthors() {
        return authors;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        return "Book[name=" + name + "authors={"+ Arrays.toString(authors) +"} + price= "  + price+ " qty=" + qty+ "]";
    }



}
