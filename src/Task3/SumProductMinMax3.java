package Task3;
import java.util.Scanner;

public class SumProductMinMax3 {
    public static void main(String[] args){
        int num1, num2, num3, product, sum , mini , maxi;
        Scanner in = new Scanner(System.in);
        System.out.println("Print 1st number");
        num1 = in.nextInt();
        System.out.println("Print 2nd number");
        num2 = in.nextInt();
        System.out.println("Print 3rd number");
        num3 = in.nextInt();
        sum = num1 + num2 + num3;
        System.out.println("Sum is :" + sum);
        product = num1 * num2 * num3;
        System.out.println("Product is :" + product);
        mini = num1;
        if (mini > num2){
            mini = num2;
        }
        if (num3 < mini){
            mini = num3;
        }
        System.out.println("Minimum is: " + mini);
        maxi = num1;
        if (maxi < num2){
            maxi = num2;
        }
        if (num3 > maxi){
            maxi = num3;
        }
        System.out.println("Maximum is: " + maxi);

    }
}
