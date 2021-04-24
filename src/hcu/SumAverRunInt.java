package hcu;

public class SumAverRunInt {
    public static void main(String [] args){
        int sum = 0;
        int number = 1;
        int maxi = 100;
        while (number<= maxi){
            sum = (number * number) + sum;
            ++number;
        }
        System.out.println(sum);
    }
}
