package Task2;

public class Product1ToN {
    public static void main (String[] args){
        int product = 1;
        int lowerbound = 1;
        int upperbound = 10;
        for (int num = lowerbound; num <= upperbound; num++){
            product *= num;

        }
        System.out.println(product);
    }
}
