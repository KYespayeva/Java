package Task3;
import java.util.Scanner;
public class SumProductMinMax5 {
    public static void main(String[] args){
        int num1, num2, num3, num4, num5, product, sum , mini , maxi;
        Scanner in = new Scanner(System.in);
        System.out.println("Print 1st number");
        num1 = in.nextInt();
        System.out.println("Print 2nd number");
        num2 = in.nextInt();
        System.out.println("Print 3rd number");
        num3 = in.nextInt();
        System.out.println("Print 4th number");
        num4 = in.nextInt();
        System.out.println("Print 5th number");
        num5 = in.nextInt();
        sum = num1 + num2 + num3+ num4+ num5;
        System.out.println("Sum is :" + sum);
        product = num1 * num2 * num3 * num4 * num5;
        System.out.println("Product is :" + product);
        mini = num1;
        if (mini > num2){
            mini = num2;
        }
        if (num3 < mini){
            mini = num3;
        }
        if (mini > num4){
            mini = num4;
        }if (mini > num5){
            mini = num5;
        }
        System.out.println("Minimum is: " + mini);
        maxi = num1;
        if (maxi < num2){
            maxi = num2;
        }
        if (num3 > maxi){
            maxi = num3;
        }
        if (maxi < num4){
            maxi = num4;
        }
        if (maxi < num5){
            maxi = num5;
        }
        System.out.println("Maximum is: " + maxi);

    }
}
